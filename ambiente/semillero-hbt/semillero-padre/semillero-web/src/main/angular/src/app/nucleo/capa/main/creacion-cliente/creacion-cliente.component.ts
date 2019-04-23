import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-creacion-cliente',
  templateUrl: './creacion-cliente.component.html'
})
export class CreacionClienteComponent implements OnInit {

  public header : string = 'Crear Clientes';
  public id : number = 110;
  public nombre : string = 'Cristian';

  constructor() { }

  ngOnInit() {
  }

}
