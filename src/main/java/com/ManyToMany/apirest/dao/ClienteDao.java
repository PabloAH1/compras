package com.ManyToMany.apirest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ManyToMany.apirest.entity.Cliente;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
