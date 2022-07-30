import { Component, OnInit } from '@angular/core';
import {ReporteUsuario} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-obtenerreporte',
  templateUrl: './obtenerreporte.component.html',
  styleUrls: ['./obtenerreporte.component.scss']
})
export class ObtenerreporteComponent implements OnInit {

  usuarios: ReporteUsuario[] = [];
  constructor(private api: ApiService) { }

  ngOnInit(): void {
    this.api.obtenerReporte().subscribe(data =>{
        this.usuarios = data.usuarios;
      }
    )
  }

}
