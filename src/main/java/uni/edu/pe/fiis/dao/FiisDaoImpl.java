package uni.edu.pe.fiis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.fiis.dto.Aplicacion;
import uni.edu.pe.fiis.dto.Perfil;
import uni.edu.pe.fiis.dto.ReporteUsuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class FiisDaoImpl implements  FiisDao {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  private Connection conexion;

  private void obtenerConexion(){
    try {
      this.conexion = jdbcTemplate.getDataSource().getConnection();
    } catch (SQLException throwables) {
      throw new RuntimeException(throwables);
    }
  }
  private void cerrarConexion(ResultSet resultado, Statement sentencia){
    try {
      if(resultado != null) resultado.close();
      if(sentencia != null) sentencia.close();
      this.conexion.commit();
      this.conexion.close();
      this.conexion = null;
    } catch (SQLException throwables) {
      throw new RuntimeException(throwables);
    }
  }


  @Override
  public List<ReporteUsuario> obtenerReporte() {
    List<ReporteUsuario> reporteUsuarios = new ArrayList<>();
    String sql = "SELECT us.codigo_usr,us.cuenta_usr,us.nombre_usr,us.password_usr,us.codigo_perfil,\n" +
      "pe.nombre_perfil,pe.indicador,ap.codigo_app,ap.nombre_app FROM perfil_aplicacion pa\n" +
      "INNER JOIN perfil pe\n" +
      "ON(pa.codigo_perfil= pe.codigo_perfil)\n" +
      "INNER JOIN aplicacion ap\n" +
      "ON(ap.codigo_app = pa.codigo_app)\n" +
      "INNER JOIN usuario us\n" +
      "ON(pe.codigo_perfil=us.codigo_perfil);";
    try {
      obtenerConexion();
      Statement sentencia = conexion.createStatement();
      ResultSet resultado = sentencia.executeQuery(sql);
      while (resultado.next()){
        reporteUsuarios.add(extraerReporte(resultado));
      }
      cerrarConexion(resultado,sentencia);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

    return reporteUsuarios;
  }

  @Override
  public Aplicacion registrarAplicacion(Aplicacion aplicacion) {
    String sql = "INSERT INTO aplicacion(codigo_app, nombre_app) VALUES(?,?);";
    try {
      obtenerConexion();
      PreparedStatement sentencia = conexion.prepareStatement(sql);
      sentencia.setString(1, aplicacion.getCodigoApp());
      sentencia.setString(2, aplicacion.getNombreApp());
      sentencia.executeUpdate();
      cerrarConexion(null,sentencia);
    } catch (SQLException throwables) {
      throw new RuntimeException(throwables);
    }
    return aplicacion;
  }

  @Override
  public Perfil actualizarIndicadorPerfil(Perfil perfil) {
    String sql = "UPDATE perfil SET indicador = '0' WHERE codigo_perfil = ?;";
    try {
      obtenerConexion();
      PreparedStatement sentencia = conexion.prepareStatement(sql);
      sentencia.setString(1, perfil.getCodigoPerfil());
      sentencia.executeUpdate();
      cerrarConexion(null,sentencia);
    } catch (SQLException throwables) {
      throw new RuntimeException(throwables);
    }
    return perfil;
  }

  private ReporteUsuario extraerReporte(ResultSet resultado) throws SQLException {
    ReporteUsuario reporte = new ReporteUsuario(
      resultado.getString("codigo_usr"),
      resultado.getString("cuenta_usr"),
      resultado.getString("nombre_usr"),
      resultado.getString("password_usr"),
      resultado.getString("codigo_perfil"),
      resultado.getString("nombre_perfil"),
      resultado.getString("indicador"),
      resultado.getString("codigo_app"),
      resultado.getString("nombre_app")
    );
    return reporte;
  }
}
