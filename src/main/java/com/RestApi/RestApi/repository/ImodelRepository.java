package com.RestApi.RestApi.repository;


import com.RestApi.RestApi.entity.modelTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImodelRepository extends JpaRepository<modelTest, Long> {


}
