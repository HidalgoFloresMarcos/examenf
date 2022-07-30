import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ActualizarindicadorComponent} from "./actualizarindicador/actualizarindicador.component";
import {ObtenerreporteComponent} from "./obtenerreporte/obtenerreporte.component";
import {RegistrarappComponent} from "./registrarapp/registrarapp.component";

const routes: Routes = [
  {path:"actualizarindicador", component: ActualizarindicadorComponent},
  {path:"obtenerreporte", component: ObtenerreporteComponent},
  {path: "registrarapp", component: RegistrarappComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
