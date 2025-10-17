package org.example;

import java.util.List;
import java.util.Optional;

public interface DAO<T>{

    // Metodos de escritura
    Optional <T>  save(T t);
    Optional <T>  update(T t);
    Optional <T>  delete(T t);

    //Metodos de lectura
    List<T> findAll();
    Optional <T>  findById(Integer id);

}
