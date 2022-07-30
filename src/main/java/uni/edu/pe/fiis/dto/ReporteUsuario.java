package uni.edu.pe.fiis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ReporteUsuario {
  private String codigoUsr;
  private String cuentaUsr;
  private String nombreUsr;
  private String passwordUsr;
  private String codigoPerfil;
  private String nombrePerfil;
  private String indicador;
  private String codigoApp;
  private String nombreApp;


}
