package com.hbt.semillero.dto;

import java.io.Serializable;


/**
 * Objeto de transferencia que mapea los atributos de la entidad bebida
 * @author Cristian Ramirez
 *
 */
public class BebidaDTO implements Serializable{
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Identificador unico de la bebida
	*/
	private int idBebida; 
	
	/**
	 * Nombre de la bebida
	 */
	private String nombre; 
	
	/**
	 * Precio de la bebida
	 */
	private double precio;

	/**
	 * Método que obtiene el valor de la propiedad idBebida
	 * @return el idBebida
	 */
	public int getIdBebida() {
		return idBebida;
	}

	/**
	 * Método que asigna el valor de la propiedad idBebida
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
