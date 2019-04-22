package com.hbt.semillero.dto;

import java.io.Serializable;


/**
 * Objeto de transferencia que mapea los atributos de la entidad Cliente
 * @author Cristian Ramirez
 *
 */
public class ClienteDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Indentificador del Cliente
	 */
	private int idCliente; 
	/**
	 * Nombre del cliente
	 */
	private String nombre;
	/**
	 * @return el idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente el idCliente a establecer
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
