package uni.edu.pe.fiis.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uni.edu.pe.fiis.dto.ReporteUsuario;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaReporte {
  List<ReporteUsuario> usuarios;

}
