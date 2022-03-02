package com.ManyToMany.apirest.controller;

import java.util.Date;

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
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CodCliente;
	
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false)
	private String empresa;
	@Column(nullable = false)
	private String puesto;
	@Column(name = "codigo_postal", nullable = false)
	private int cp;
	@Column(nullable = false)
	private String provincia;
	@Column(nullable = false)
	private int telefono;
	@Column(nullable = false)
	private Date fechaNacimiento;
	
	/*@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "CodArticulo")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Articulo articulo;*/

}
