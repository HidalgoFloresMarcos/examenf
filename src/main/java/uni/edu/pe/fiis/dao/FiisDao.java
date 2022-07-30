package uni.edu.pe.fiis.dao;


import uni.edu.pe.fiis.dto.Aplicacion;
import uni.edu.pe.fiis.dto.Perfil;
import uni.edu.pe.fiis.dto.ReporteUsuario;

import java.util.List;

public interface FiisDao {
  List<ReporteUsuario> obtenerReporte();

  Aplicacion registrarAplicacion(Aplicacion aplicacion);

  Perfil actualizarIndicadorPerfil(Perfil perfil);
}
