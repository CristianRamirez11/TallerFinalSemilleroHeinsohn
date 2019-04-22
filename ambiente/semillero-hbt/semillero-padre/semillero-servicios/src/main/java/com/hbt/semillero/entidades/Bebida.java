package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Clase que representa las bebidas que se seleccionaran para crear el pedido por el cliente
 * @author Cristian Ramirez
 *
 */
@Entity
@Table(name = "BEBIDA")
public class Bebida {
	
	/**
	 * atributos de la clase bebida
	 */
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "BEBIDA_ID")
	private int idBebida; 
	
	@Column(name = "BEBIDA_NOMBRE")
	private String nombre; 
	
	@Column(name = "PRECIO")
	private double precio;
	
	/*
	 * Metodos de acceso y modificadores de atributos
	 */
	/**
	 * Obtiene el id de la bebida
	 * @return el idBebida
	 */
	public int getIdBebida() {
		return idBebida;
	}
	/**
	 * Modifica el id de la bebeida
	 * @param idBebida el idBebida a establecer
	 */
	public void setIdBebida(int idBebida) {
		this.idBebida = idBebida;
	}
	/**
	 * Obtiene el nombre de la bebida
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 *  Modifica el nombre de la bebeida
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtiene el precio de la bebida
	 * @return el precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 *  Modifica el precio de la bebeida
	 * @param precio el precio a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	} 
	
	
	
}
