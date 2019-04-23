import { Component, Input, OnInit } from '@angular/core';

import { ConsultaFacturasService } from '../../../../../nucleo/servicios/consultas-facturas-servicio/consulta.factura.servicio';
import { FacturaDTO } from '../modelo/facturaDTO';
import { ClienteDTO } from '../modelo/clienteDTO';
import { ClienteServicioDTO } from '../modelo/clienteServicioDTO';

@Component({
  selector: 'app-pedidos-resultados',
  templateUrl: './resultados.component.html',
  //styleUrls: ['./resultados.component.css']
})
export class ResultadosComponent implements OnInit {
  @Input() public idFactura:number;
  @Input() public valorTotal:string;
  
  public listaFacturasDTO: FacturaDTO[]; 
  public facturaDTO: FacturaDTO; 
  
  public listaClientesDTO: ClienteServicioDTO[]; 
  public clienteDTO: ClienteServicioDTO; 
  
  constructor(private FacturasService: ConsultaFacturasService) { }

  ngOnInit() {
  }

  public consultarClientes() {
	    let idCliente: string = '1';
	  	this.FacturasService.consultarClientes(idCliente).subscribe(
	    	clientes => {
		        this.listaClientesDTO = clientes;
		      },
		      error => {
		        console.log(error);
		      } 
	    );    
	    console.log('resultado servicio.... ' + this.listaClientesDTO)
   }
   
   public consultarFacturas() {
	    this.listaFacturasDTO = [];
	  	this.FacturasService.consultarFacturasExistentes().subscribe(
	    	fac => {
		        this.idFactura = fac.idFactura;
		      },
		      error => {
		        console.log(error);
		      } 
	    );    
   }

}
