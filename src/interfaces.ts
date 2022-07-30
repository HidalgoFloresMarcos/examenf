export interface ReporteUsuario{
  codigoUsr: string;
  cuentaUsr:string;
  nombreUsr:string;
  passwordUsr:string;
  codigoPerfil:string;
  nombrePerfil:string;
  indicadorPerfil:string;
  codigoApp:string;
  nombreApp:string;
}

export interface RespuestaReporte{
  usuarios:ReporteUsuario[];
}

export interface Perfil {
  codigoPerfil: string;
  indicadorPerfil: string;
}

export interface Aplicacion {
  codigoApp: string;
  nombreApp: string;
}
