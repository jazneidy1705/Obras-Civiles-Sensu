package co.com.ws.sensu.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ws.sensu.entity.Solicitud;
import co.com.ws.sensu.repository.SolicitudRepository;
import co.com.ws.state.EstadoSolicitud;

@Service
public class SolicitudImpl implements SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public Solicitud guardar(Solicitud solicitud) {
	Date fechaCreacion = new Date();
	solicitud.setFechaCreacion(fechaCreacion);
	solicitud.setHoraCreacion(fechaCreacion);
	solicitud.setEstado(EstadoSolicitud.ABIERTO);
	return solicitudRepository.save(solicitud);
    }

    @Override
    public Solicitud buscarPorId(Long id) {
	Optional<Solicitud> optional = solicitudRepository.findById(id);
	return optional.isPresent() ? optional.get() : new Solicitud();
    }

    @Override
    public List<Solicitud> buscarTodos() {
	return solicitudRepository.findAll();
    }

    @Override
    public void eliminarPorId(Long id) {
	solicitudRepository.deleteById(id);
    }

    @Override
    public void eliminar(Solicitud solicitud) {
	solicitudRepository.delete(solicitud);
    }

    @Override
    public Solicitud actualizar(Solicitud nuevaSolicitud) {
	return solicitudRepository.save(nuevaSolicitud);
    }

    @Override
    public boolean existe(Solicitud solicitud) {
	return solicitudRepository.existsById(solicitud.getId());
    }

}
