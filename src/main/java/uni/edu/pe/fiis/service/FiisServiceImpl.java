package uni.edu.pe.fiis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.fiis.dao.FiisDao;
import uni.edu.pe.fiis.dto.Aplicacion;
import uni.edu.pe.fiis.dto.Perfil;
import uni.edu.pe.fiis.dto.ReporteUsuario;

import java.util.List;
@Service
public class FiisServiceImpl implements FiisService{
  @Autowired
  private FiisDao dao;

  @Override
  public List<ReporteUsuario> obtenerReporte() {
    return dao.obtenerReporte();
  }

  @Override
  public Aplicacion registrarAplicacion(Aplicacion aplicacion) {
    return dao.registrarAplicacion(aplicacion);
  }

  @Override
  public Perfil actualizarIndicadorPerfil(Perfil perfil) {
    return dao.actualizarIndicadorPerfil(perfil);
  }
}
