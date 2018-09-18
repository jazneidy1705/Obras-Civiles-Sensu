package co.com.ws.sensu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import co.com.ws.sensu.entity.Solicitud;
import co.com.ws.sensu.service.SolicitudService;
import co.com.ws.sensu.util.SensuError;
import co.com.ws.sensu.util.ValidateNumbers;

@RestController
@RequestMapping("/sensu/api/v1")
public class SolicitudController {

    @Autowired
    SolicitudService solicitudService;

    /**
     * GET: obtener una solicitud por id
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/solicitud/{id}", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
    public ResponseEntity<?> buscarSolicitud(@PathVariable("id") String id) {

	if (!ValidateNumbers.isLong(id)) {
	    return new ResponseEntity<SensuError>(new SensuError("ERROR: Id = " + id + ", no es un numero"), HttpStatus.CONFLICT);
	}

	Solicitud solicitud = solicitudService.buscarPorId(ValidateNumbers.convertToLong(id));

	if (solicitud == null || solicitud.getId() == null) {
	    return new ResponseEntity<SensuError>(new SensuError("ERROR: Solicitud con Id = " + id + ", no existe"), HttpStatus.NOT_FOUND);
	}

	if (solicitud.getFechaCreacion() == null || solicitud.getSolicita() == null) {
	    return new ResponseEntity<SensuError>(new SensuError("ERROR: Solicitud con Id = " + id + ", es inconsistente"), HttpStatus.CONFLICT);
	}
	return new ResponseEntity<Solicitud>(solicitud, HttpStatus.OK);
    }

    /**
     * POST: Crear una solicitud
     * 
     * @param solicitud
     * @param ucBuilder
     * @return
     */
    @RequestMapping(value = "/solicitud/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> crearSolicitud(@RequestBody Solicitud solicitud, UriComponentsBuilder ucBuilder) {

	if (solicitud.getSolicita() == null || solicitud.getSolicita().isEmpty()) {
	    return new ResponseEntity<SensuError>(new SensuError("Solicitud incompleta"), HttpStatus.CONFLICT);
	}
	
	Solicitud solicitudCreada = solicitudService.guardar(solicitud);
	HttpHeaders headers = new HttpHeaders();
	headers.setLocation(ucBuilder.path("/solicitud/{id}").buildAndExpand(solicitudCreada.getId()).toUri());
	return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
}
