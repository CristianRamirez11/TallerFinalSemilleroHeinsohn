package com.hbt.semillero.dto;

import java.io.Serializable;


/**
 * Objeto de transferencia que mapea los atributos de la entidad factura
 * @author Cristian Ramirez
 *
 */
public class FacturaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idFactura;
	
	private ClienteDTO idCliente;
	
	private double iva; 
	
	private double valorTotal;

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
	public ClienteDTO getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente el idCliente a establecer
	 */
	public void setIdCliente(ClienteDTO idCliente) {
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
