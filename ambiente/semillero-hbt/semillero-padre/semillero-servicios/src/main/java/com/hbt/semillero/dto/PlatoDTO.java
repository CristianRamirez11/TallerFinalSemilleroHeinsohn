package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Objeto de transferencia que mapea los atributos de la entidad plato
 * @author Cristian Ramirez
 *
 */
public class PlatoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idPlato; 
	
	private String nombre;
	
	private double precio;
	
	private String descripcion;

	/**
	 * @return el idPlato
	 */
	public int getIdPlato() {
		return idPlato;
	}

	/**
	 * @param idPlato el idPlato a establecer
	 */
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
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

	/**
	 * @return el descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion el descripcion a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	
}
