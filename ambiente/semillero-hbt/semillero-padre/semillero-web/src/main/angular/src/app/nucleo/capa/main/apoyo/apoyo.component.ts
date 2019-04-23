import { Component, OnInit } from '@angular/core';
import { ClienteDTO } from './modelo/clienteDTO';

@Component({
  selector: 'app-apoyo',
  templateUrl: './apoyo.component.html',
})
export class ApoyoComponent implements OnInit {

  public mostrarFactura:boolean;
  
  public cliente: ClienteDTO;
  public clientes: ClienteDTO[];
  
  constructor() { }

  public ngOnInit() {
  	this.mostrarFactura = true;
  	this.cliente = {
        id: '0',
		    nombre: '',
    };
    this.clientes = [];
  }

  mostrar(){
  	this.mostrarFactura = true;
  }
  
  ocultar(){
  	this.mostrarFactura = false;
  }
  
  public guardar() {
  	console.log('guardando....' + this.cliente.nombre);
    this.clientes.push(this.cliente);
    console.log('cantidad de clientes....' + this.clientes.length);
    
  }
  public borrar(cliente: ClienteDTO) {
  	console.log('borrando....');
    this.clientes = this.clientes.filter(c => c.nombre !== cliente.nombre);
     
  }

}
