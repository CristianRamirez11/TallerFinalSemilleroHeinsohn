package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Clase que representa el plato que ha solicitado el cliente
 * @author Cristian Ramirez
 *
 */
@Entity
@Table(name = "PLATO")
public class Plato {
	
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "PLATO_ID")
	private int idPlato; 
	
	@Column(name = "PLATO_NOMBRE")
	private String nombre;
	
	@Column(name = "PRECIO")
	private double precio;
	
	@Column(name = "PLATO_DESCRIPCION")
	private String descripcion;
	
	/*
	 * Metodos de acceso y modificadores de atributos
	 */
	
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
