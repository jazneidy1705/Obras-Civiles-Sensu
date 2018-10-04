package co.com.ws.sensu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ws.sensu.entity.Cotizacion;
import co.com.ws.sensu.entity.ItemCotizacion;
import co.com.ws.sensu.entity.Material;
import co.com.ws.sensu.entity.Proveedor;
import co.com.ws.sensu.repository.CotizacionRepository;
import co.com.ws.sensu.repository.ItemCotizacionRepository;
import co.com.ws.sensu.repository.MaterialRepository;
import co.com.ws.sensu.repository.ProveedorRepository;

@Service
public class CotizacionImpl implements CotizacionService {

	@Autowired
	CotizacionRepository cotizacionRepository;

	@Autowired
	ProveedorRepository proveedorRepositoy;

	@Autowired
	MaterialRepository materialRepository;

	@Autowired
	ItemCotizacionRepository itemCotizacionRepository;

	@Override
	@Transactional
	public void crearCotizacion(Cotizacion cotizacion) {

		ItemCotizacion itemCotizacion = new ItemCotizacion();

		List<ItemCotizacion> listaCotizacion = new ArrayList<>();

		Material nuevoMaterial = materialRepository.save(itemCotizacion.getMaterial());

		itemCotizacion.setMaterial(nuevoMaterial);

		listaCotizacion.add(itemCotizacionRepository.save(itemCotizacion));

		Proveedor nuevoProveedor = proveedorRepositoy.save(cotizacion.getProveedor());

		cotizacion.setProveedor(nuevoProveedor);

		cotizacion.setItemsCotizacion(listaCotizacion);

		cotizacionRepository.save(cotizacion);
	}

}
