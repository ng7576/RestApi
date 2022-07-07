package com.RestApi.RestApi.service;

import com.RestApi.RestApi.Utils.modelNotFoundExceptionHandler;
import com.RestApi.RestApi.entity.modelTest;
import com.RestApi.RestApi.repository.ImodelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class modelServiceImpl implements ImodelService{


    @Autowired
    private ImodelRepository imodelRepository;

    //POST METHOD TO CREATE A NEW ENTRY
    @Override
    public modelTest saveModel(modelTest model) {
        return imodelRepository.save(model) ;
    }


    //RETURNS LIST OF ALL MODELS
    @Override
    public List<modelTest> getAllModelsList() {
        return imodelRepository.findAll();
    }


    //GET MODEL BY ID
    @Override
    public modelTest getModelById(Long id) throws modelNotFoundExceptionHandler {
        Optional<modelTest> model= imodelRepository.findById(id);
        if(model.isEmpty()) {
            throw  new modelNotFoundExceptionHandler("Model with given id was not found");
        }
        return model.get();
    }


    //DELETE MODEL BY ID
    @Override
    public void deleteModelById(Long id) throws modelNotFoundExceptionHandler {
        Optional<modelTest> model = imodelRepository.findById(id);
        if(model.isEmpty()) {
            throw new modelNotFoundExceptionHandler("Model with given id was not found");
        }
        imodelRepository.deleteById(id);
    }


    //UPDATE MODEL BY ID
    @Override
    public modelTest updateModelById(Long id, modelTest modelToUpdate) throws modelNotFoundExceptionHandler {
        Optional<modelTest> model = imodelRepository.findById(id);
        if (model.isEmpty()) {
            throw  new modelNotFoundExceptionHandler("Item with given Id, ${id} was not found");
        }

        modelTest currentModel = model.get();

        if (Objects.nonNull(modelToUpdate.getObjectName()) &&
                !"".equalsIgnoreCase(modelToUpdate.getObjectName())
        )
        {
            currentModel.setObjectName(modelToUpdate.getObjectName());

        }

        if (Objects.nonNull(modelToUpdate.getObjectCategory()) &&
                !"".equalsIgnoreCase(modelToUpdate.getObjectCategory())
        )
        {
            currentModel.setObjectCategory(modelToUpdate.getObjectCategory());

        }

        if (Objects.nonNull(modelToUpdate.getObjectDescription()) &&
                !"".equalsIgnoreCase(modelToUpdate.getObjectDescription())
        )
        {
            currentModel.setObjectDescription(modelToUpdate.getObjectDescription());

        }

        if (Objects.nonNull(modelToUpdate.getObjectPrice())
        )
        {
            currentModel.setObjectPrice(modelToUpdate.getObjectPrice());
        }

        if (Objects.nonNull(modelToUpdate.getObjectStock())
        )
        {
            currentModel.setObjectStock(modelToUpdate.getObjectStock());

        }

        return imodelRepository.save(currentModel);

    }



}
