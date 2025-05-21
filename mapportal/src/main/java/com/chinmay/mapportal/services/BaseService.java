package com.chinmay.mapportal.services;

import java.util.List;

public interface BaseService<T> {
  
    //get All 
    List<T> getAll();

   //get By Id
    T getById(Long id);

    //save 
    T save(T entity);

    //save All 
    List<T> saveAll(java.util.List<T> entityList);

    //delete 
    void delete(T entity);

    //delete By Id
    void deleteById(Long id);
}

