package com.hbt.semillero.servicios.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.servicios.interfaces.IConsultasEjbLocal;

/**
 * EJB de las COnsultas a realizar
 * @author Cristian Ramirez
 *
 */
public class ConsultasEJB implements IConsultasEjbLocal{
	
	@PersistenceContext
	private EntityManager entityM;

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO crearCliente(ClienteDTO clienteDTO) {
		try {
			Cliente cliente = asignarAtributosBasicos(clienteDTO);
			entityM.persist(cliente);
		}
		catch(Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}
		return new ResultadoDTO(true, "Creado de forma exitosa");
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ClienteDTO> consultarCliente(int idCliente) {
		StringBuilder consulta = new StringBuilder("Select cli FROM Cliente cli WHERE 1=1 ");
		Map<String, Object> parametros = new HashMap<>();
		if (idCliente != 0) {
			consulta.append(" and cli.cliente_id =:idCliente");
			parametros.put("idCliente", idCliente);
		}

		Query query = entityM.createQuery(consulta.toString());

		for (Entry<String, Object> entry : parametros.entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue()).getResultList();
		}

		List<Cliente> clientes = query.getResultList();
		List<ClienteDTO> clientesRetorno = new ArrayList<>();
		for (Cliente cliente : clientes) {
			ClienteDTO clienteDTO = new ClienteDTO();
			clienteDTO.setNombre(cliente.getNombre());

			clientesRetorno.add(clienteDTO);
		}
		return clientesRetorno;
	}

	public ResultadoDTO crearPedido(FacturaDetalleDTO facturaDetalleDTO) {
		return null;
	}

	@Override
	public ResultadoDTO EliminarPedido(int idPedido) {
		
		return null;
	}

	@Override
	public List<FacturaDTO> consultarFacturasExistentes() {
		List<Factura> facturas = entityM.createQuery("Select fd from Factura fd").getResultList();
		List<FacturaDTO> fRetorno = new ArrayList<>();
		for (Factura fd : facturas) {
			FacturaDTO fDto = construirFacturaDTO(fd);
			fRetorno.add(fDto);
		}
		return fRetorno;
	}
	
	
	private Cliente asignarAtributosBasicos(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setNombre(clienteDTO.getNombre());
		return cliente;
	}
	
	private FacturaDTO construirFacturaDTO(Factura fd) {
		FacturaDTO fdDto = new FacturaDTO();
		fdDto.setIva(fd.getIva());
		fdDto.setValorTotal(fd.getValorTotal());
		fdDto.setIdCliente(consultarCliente(fd.getIdCliente()).get(fd.getIdCliente()));
		return fdDto;
	}
	
	
	
	
	
}
