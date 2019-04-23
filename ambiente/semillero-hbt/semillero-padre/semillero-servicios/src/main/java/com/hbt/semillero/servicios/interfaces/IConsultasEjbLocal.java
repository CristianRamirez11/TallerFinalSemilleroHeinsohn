package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.ResultadoDTO;

public interface IConsultasEjbLocal {
	
	public ResultadoDTO crearCliente (ClienteDTO clienteDTO);
	
	public List<ClienteDTO> consultarCliente (int idCliente); 
	
	public ResultadoDTO crearPedido(FacturaDetalleDTO facturaDetalleDTO);
	
	public ResultadoDTO EliminarPedido (int idPedido);
	
	public List<FacturaDTO> consultarFacturasExistentes (); 

}
