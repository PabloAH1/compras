package com.ManyToMany.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ManyToMany.apirest.dao.ComprasDao;
import com.ManyToMany.apirest.entity.Compra;

@Service
public class CompraServiceImpl implements CompraService {
	
	@Autowired
	private ComprasDao compraDao;

	@Override
	@Transactional(readOnly=true)
	public List<Compra> findAll() {
		// TODO Auto-generated method stub
		return (List<Compra>) compraDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Compra findById(Long id) {
		// TODO Auto-generated method stub
		return compraDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Compra save(Compra compra) {
		// TODO Auto-generated method stub
		return compraDao.save(compra);
	}

}
