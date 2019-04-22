package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Factura Detalle
 * @author Cristian Ramirez
 *
 */
public class FacturaDetalleDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idDetalle; 
	
	private FacturaDTO idFactura; 
	
	private PlatoDTO idPlato; 
	
	private BebidaDTO idBebida; 
	
	private double precioUnitario;

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
	public FacturaDTO getIdFactura() {
		return idFactura;
	}

	/**
	 * @param idFactura el idFactura a establecer
	 */
	public void setIdFactura(FacturaDTO idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * @return el idPlato
	 */
	public PlatoDTO getIdPlato() {
		return idPlato;
	}

	/**
	 * @param idPlato el idPlato a establecer
	 */
	public void setIdPlato(PlatoDTO idPlato) {
		this.idPlato = idPlato;
	}

	/**
	 * @return el idBebida
	 */
	public BebidaDTO getIdBebida() {
		return idBebida;
	}

	/**
	 * @param idBebida el idBebida a establecer
	 */
	public void setIdBebida(BebidaDTO idBebida) {
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
