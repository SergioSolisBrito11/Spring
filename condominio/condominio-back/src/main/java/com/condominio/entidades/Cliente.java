package com.condominio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE", schema ="EMPRESA")
public class Cliente implements Serializable{

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -5882998955688046114L;

	/**
	 * CEDULA_CLIENTE
	 */
	@Id
	@Column(name = "CEDULA_CLIENTE")
	Long cedulaCliente;
	
	/**
	 * "NOMBRE_CLIENTE
	 */
	@Column(name = "NOMBRE_CLIENTE")
	String nombreCliente;
	
	
}


