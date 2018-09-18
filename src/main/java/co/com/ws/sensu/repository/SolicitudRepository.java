package co.com.ws.sensu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ws.sensu.entity.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {

}
