package com.hbt.semillero.dto;

import java.io.Serializable;


/**
 * Objeto de transferencia que mapea los atributos de la entidad bebida
 * @author Cristian Ramirez
 *
 */
public class BebidaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * atributos de la clase bebida
	*/
	private int idBebida; 
	
	private String nombre; 
	
	private double precio;

	/**
	 * @return el idBebida
	 */
	public int getIdBebida() {
		return idBebida;
	}

	/**
	 * @param idBebida el idBebida a establecer
	 */
	public void setIdBebida(int idBebida) {
		this.idBebida = idBebida;
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

	/**
	 * @return el precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio el precio a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
