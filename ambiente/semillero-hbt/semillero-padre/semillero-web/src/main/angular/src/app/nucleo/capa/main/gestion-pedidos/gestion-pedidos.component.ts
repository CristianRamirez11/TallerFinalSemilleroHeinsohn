import { Component, OnInit } from '@angular/core';
import { FacturaDTO } from './modelo/FacturaDTO';
import { ClienteDTO } from './modelo/clienteDTO';


@Component({
  selector: 'app-gestion-pedidos',
  templateUrl: './gestion-pedidos.component.html',
  //styleUrls: ['./gestion-pedidos.component.css']
})
export class GestionPedidosComponent implements OnInit {

  public factura:FacturaDTO; 
  public cliente: ClienteDTO;

  constructor() { }

  ngOnInit() {
    this.factura = {idFactura: 1, idCliente: this.cliente, iva: '0.2', valorTotal: '25000' }
  }

}
