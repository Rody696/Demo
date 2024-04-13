package com.example.demo.models.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.entity.Clientes;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Long> {

}
