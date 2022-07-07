package com.RestApi.RestApi.Controllers;


import com.RestApi.RestApi.Utils.modelNotFoundExceptionHandler;
import com.RestApi.RestApi.entity.modelTest;
import com.RestApi.RestApi.service.ImodelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class modelTestController {
    //We created a reference for the interface. Auto wired handles creation and deletion of those objects.

    @Autowired
    private ImodelService imodelService;

    private final Logger LOGGER = LoggerFactory.getLogger(modelTestController.class);

    //TESTING API REQUEST LEAVE IT AS IT IS
    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }

    // POST REQUESTS
    @PostMapping("/model")
    public modelTest saveModel(@Valid @RequestBody modelTest model) {
        LOGGER.info("This is a post request") ;
        return imodelService.saveModel(model);
    }


    //GET REQUESTS
    @GetMapping("/models")
    public List<modelTest> getAllModels() {
        return imodelService.getAllModelsList();
    }
    @GetMapping("/model/{id}")
    public modelTest getModelById(@PathVariable("id") Long id) throws modelNotFoundExceptionHandler {
        return imodelService.getModelById(id);
    }

    //DELETE REQUESTS
    @DeleteMapping("/model/{id}")
    public String deleteModelById(@PathVariable("id") Long id) throws modelNotFoundExceptionHandler{

        imodelService.deleteModelById(id);
        return "This has been deleted";
    }

    //PUT REQUESTS
    @PutMapping("/model/{id}")
    public modelTest updateModelById(@Valid @PathVariable("id") Long id, @RequestBody modelTest modelToUpdate) throws modelNotFoundExceptionHandler{
        return imodelService.updateModelById(id, modelToUpdate);

    }




}
