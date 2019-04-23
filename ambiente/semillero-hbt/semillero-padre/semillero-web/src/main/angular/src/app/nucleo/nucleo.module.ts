import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CapaComponent } from './capa/capa.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { MainComponent } from './capa/main/main.component';
import { PiepaginaComponent } from './capa/piepagina/piepagina.component';
import { ServiciosComponent } from './servicios/servicios.component';
import { ApoyoComponent } from './capa/main/apoyo/apoyo.component';
import { ModeloComponent } from './capa/main/apoyo/modelo/modelo.component';
import { CreacionClienteComponent } from './capa/main/creacion-cliente/creacion-cliente.component';
import { GestionPedidosComponent } from './capa/main/gestion-pedidos/gestion-pedidos.component';
import { FiltrosComponent } from './capa/main/gestion_pedidos/filtros/filtros.component';
import { ResultadosComponent } from './capa/main/gestion_pedidos/resultados/resultados.component';

@NgModule({
  declarations: [CapaComponent, EncabezadoComponent, MainComponent, PiepaginaComponent, ServiciosComponent, ApoyoComponent, ModeloComponent, CreacionClienteComponent, GestionPedidosComponent, FiltrosComponent, ResultadosComponent],
  imports: [
    CommonModule
  ]
})
export class NucleoModule { }
