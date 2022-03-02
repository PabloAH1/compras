package com.ManyToMany.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.ManyToMany.apirest.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
