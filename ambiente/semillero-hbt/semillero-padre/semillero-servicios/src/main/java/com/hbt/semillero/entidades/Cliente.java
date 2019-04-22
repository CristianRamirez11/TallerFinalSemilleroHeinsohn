package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Clase que representa un cliente en el sistema
 * @author Cristian Ramirez
 *
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(generator = "SEQ")
	@Column(name = "CLIENTE_ID")
	private int idCliente; 
	
	@Column(name = "CLIENTE_NOMBRE")
	private String nombre;
	
	/*
	 * Metodos de acceso y modificadores de atributos
	 */

	/**
	 * Metodo que permite obtener el id del cliente 
	 * @return el idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * Metodo que permite modificar o actualizar el id del cliente
	 * @param idCliente el idCliente a establecer
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * Metodo que permite obtener el nombre del cliente 
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que permite modificar o actualizar el nombre del cliente
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}  
	
}
