package co.com.ws.sensu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.ws.sensu.entity.Proveedor;
import co.com.ws.sensu.service.ProveedorService;

@RestController
@RequestMapping("/sensu/api/v1")
public class ProveedorControllers {

	@Autowired
	ProveedorService proveedorService;

	@PostMapping("/proveedor")
	@ResponseStatus(HttpStatus.CREATED)
	public Proveedor crearRegistroParqueo(@RequestBody Proveedor proveedor) {
		return proveedorService.crearProveedor(proveedor);
	}

}
