package co.com.ws.sensu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ws.sensu.entity.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {

}
