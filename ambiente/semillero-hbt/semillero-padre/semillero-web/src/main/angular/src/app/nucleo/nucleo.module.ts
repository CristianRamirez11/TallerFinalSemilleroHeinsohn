import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CapaComponent } from './capa/capa.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { MainComponent } from './capa/main/main.component';
import { PiepaginaComponent } from './capa/piepagina/piepagina.component';
import { ServiciosComponent } from './servicios/servicios.component';

@NgModule({
  declarations: [CapaComponent, EncabezadoComponent, MainComponent, PiepaginaComponent, ServiciosComponent],
  imports: [
    CommonModule
  ]
})
export class NucleoModule { }
