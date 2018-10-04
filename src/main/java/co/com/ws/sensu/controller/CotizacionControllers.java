package co.com.ws.sensu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.ws.sensu.entity.Cotizacion;
import co.com.ws.sensu.service.CotizacionService;

@RestController
@RequestMapping("/sensu/api/v1")
public class CotizacionControllers {
	
	@Autowired
	CotizacionService cotizacionService;
	
	
	@PostMapping("/cotizacion")
	@ResponseStatus(HttpStatus.CREATED)
	public void crearCotizacion(@RequestBody Cotizacion cotizacion) {
		cotizacionService.crearCotizacion(cotizacion);
	}
	
	

}
