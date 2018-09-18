package co.com.ws.sensu.service;

import java.util.List;

import co.com.ws.sensu.entity.Solicitud;

public interface SolicitudService {

	Solicitud guardar(Solicitud solicitud);

	Solicitud buscarPorId(Long id);

	List<Solicitud> buscarTodos();

	void eliminarPorId(Long id);

	void eliminar(Solicitud solicitud);

	Solicitud actualizar(Solicitud nuevaSolicitud);
	
	boolean existe(Solicitud solicitud);
}
