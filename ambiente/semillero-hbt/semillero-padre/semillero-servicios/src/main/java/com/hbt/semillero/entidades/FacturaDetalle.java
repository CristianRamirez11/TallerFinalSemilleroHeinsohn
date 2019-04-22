package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de un pedido
 * @author Cristian Ramirez
 *
 */
@Entity
@Table(name = "FACTURA_DETALLE")
public class FacturaDetalle {
	/**
	 * atributos de la clase Factura Detalle
	 */
	
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "DETALLE_ID")
	private int idDetalle; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FACTURA_ID")
	private int idFactura; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLATO_ID")
	private int idPlato; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BEBIDA_ID")
	private int idBebida; 
	
	@Column(name = "PRECIO_UNITARIO")
	private double precioUnitario;
	
	/*
	 * Metodos de acceso y modificadores de atributos
	 */
	/**
	 * @return el idDetalle
	 */
	public int getIdDetalle() {
		return idDetalle;
	}
	/**
	 * @param idDetalle el idDetalle a establecer
	 */
	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}
	/**
	 * @return el idFactura
	 */
	public int getIdFactura() {
		return idFactura;
	}
	/**
	 * @param idFactura el idFactura a establecer
	 */
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
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
	 * @return el precioUnitario
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	/**
	 * @param precioUnitario el precioUnitario a establecer
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	} 
	
}
