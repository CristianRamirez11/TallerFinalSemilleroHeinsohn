import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import { FacturaDTO } from '../../capa/main/gestion-pedidos/modelo/facturaDTO';
import { ClienteServicioDTO } from '../../capa/main/gestion-pedidos/modelo/clienteServicioDTO';

@Injectable({
  providedIn: 'root'
})
export class ConsultaFacturasService extends AbstractService {
	
  public factura: FacturaDTO;
  public listaFacturaDTO: FacturaDTO[];
  
  /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

 public consultarClientes(idCliente: string):  Observable<ClienteServicioDTO[]> {
 	return this.get<ClienteServicioDTO[]>("/semillero-servicios", "/ConsultasRest/consultarClientes",
	{
        "idCliente":idCliente,
      });
 }
 
 //Cambiar rest
 public consultarFacturasExistentes() : Observable<FacturaDTO> { 
  	return this.get<FacturaDTO>("/semillero-servicios", "/ConsultasRest/consultarVehiculos");
 }

}
