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
 * Clase que representa el pedido que ha hecho el cliente
 * @author Cristian Ramirez
 *
 */
@Entity
@Table(name = "FACTURA")
public class Factura {
	
	@Id
	@GeneratedValue(generator = "SEQ")
	@Column(name = "FACTURA_ID")
	private int idFactura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE")
	private int idCliente;
	
	@Column(name = "IVA")
	private double iva; 
	
	@Column(name = "TOTAL")
	private double valorTotal;
	
	/*
	 * Metodos de acceso y modificadores de atributos
	 */
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
	 * @return el iva
	 */
	public double getIva() {
		return iva;
	}
	/**
	 * @param iva el iva a establecer
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}
	/**
	 * @return el valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}
	/**
	 * @param valorTotal el valorTotal a establecer
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	} 
	
	
}
