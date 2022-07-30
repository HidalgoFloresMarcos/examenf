import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ObtenerreporteComponent } from './obtenerreporte/obtenerreporte.component';
import { RegistrarappComponent } from './registrarapp/registrarapp.component';
import { ActualizarindicadorComponent } from './actualizarindicador/actualizarindicador.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    ObtenerreporteComponent,
    RegistrarappComponent,
    ActualizarindicadorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
