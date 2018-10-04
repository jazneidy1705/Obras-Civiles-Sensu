package co.com.ws.sensu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ws.sensu.entity.Proveedor;
import co.com.ws.sensu.repository.ProveedorRepository;

@Service
public class ProveedorImpl implements ProveedorService {

	@Autowired
	ProveedorRepository proveedorRepository;

	@Override
	@Transactional
	public Proveedor crearProveedor(Proveedor proveedor) {
		return proveedorRepository.save(proveedor);
	}

}
