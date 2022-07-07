package com.RestApi.RestApi.service;



//Following  Standard practice
//one service can have multiple implementation, so we are creating an interface

import com.RestApi.RestApi.Utils.modelNotFoundExceptionHandler;
import com.RestApi.RestApi.entity.modelTest;

import java.util.List;

public interface ImodelService {


    public modelTest saveModel(modelTest model);

    public List<modelTest> getAllModelsList();

    public modelTest getModelById(Long id) throws modelNotFoundExceptionHandler;

    public void deleteModelById(Long id) throws modelNotFoundExceptionHandler;

    public modelTest updateModelById(Long id, modelTest modelToUpdate) throws modelNotFoundExceptionHandler;
}
