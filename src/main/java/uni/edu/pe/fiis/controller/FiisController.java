package uni.edu.pe.fiis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.fiis.dto.Aplicacion;
import uni.edu.pe.fiis.dto.Perfil;
import uni.edu.pe.fiis.dto.rest.RespuestaReporte;
import uni.edu.pe.fiis.service.FiisService;

@RestController
@CrossOrigin(origins = {"*"})
public class FiisController {

  @Autowired
  FiisService service;

  @RequestMapping(value = "/obtenerReporte",
    method = RequestMethod.POST,
    produces = "application/json;charset=utf-8"
  )
  public @ResponseBody RespuestaReporte obtenerReporte(){
    RespuestaReporte rpta = new RespuestaReporte();
    rpta.setUsuarios(service.obtenerReporte());
    return rpta;

  }

  @RequestMapping(value = "/registrarAplicacion",
    method = RequestMethod.POST,
    produces = "application/json;charset=utf-8"
  )
  public @ResponseBody Aplicacion registrarAplicacion(@RequestBody Aplicacion aplicacion){

    return service.registrarAplicacion(aplicacion);

  }

  @RequestMapping(value = "/actualizarIndicadorPerfil",
    method = RequestMethod.POST,
    produces = "application/json;charset=utf-8"
  )
  public @ResponseBody Perfil actualizarIndicadorPerfil(@RequestBody Perfil perfil){

    return service.actualizarIndicadorPerfil(perfil);

  }
}
