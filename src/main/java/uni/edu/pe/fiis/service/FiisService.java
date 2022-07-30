package uni.edu.pe.fiis.service;

import uni.edu.pe.fiis.dto.Aplicacion;
import uni.edu.pe.fiis.dto.Perfil;
import uni.edu.pe.fiis.dto.ReporteUsuario;
import uni.edu.pe.fiis.dto.rest.RespuestaReporte;

import java.util.List;

public interface FiisService {
  List<ReporteUsuario> obtenerReporte();

  Aplicacion registrarAplicacion(Aplicacion aplicacion);

  Perfil actualizarIndicadorPerfil(Perfil perfil);
}
