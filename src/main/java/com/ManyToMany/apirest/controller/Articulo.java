package com.ManyToMany.apirest.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "articulos")
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CodArticulo;
	
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String descripcion;
	@Column(nullable = false)
	private int precio;
	@Column(nullable = false)
	private int stock;
	@Column(nullable = false)
	private int stockSeguridad;
	@Column(nullable = false)
	private String imagen;
	
	/*@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "CodCliente")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Cliente cliente;*/
	
	
}
