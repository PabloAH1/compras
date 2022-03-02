package com.ManyToMany.apirest.services;

import java.util.List;

import com.ManyToMany.apirest.entity.Compra;

public interface CompraService {
	
	public List<Compra> findAll();
	public Compra findById(Long id);
	public Compra save(Compra compra);
	
}
