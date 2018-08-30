package com.obrasciviles.sensu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.obrasciviles.sensu.convertidor.ConvertidorCotizacion;
import com.obrasciviles.sensu.dto.CotizacionDTO;
import com.obrasciviles.sensu.entity.Cotizacion;
import com.obrasciviles.sensu.repository.CotizacionRepository;
import com.obrasciviles.sensu.util.EstadoCotizacionEnum;


@Service
public class CotizacionService implements CotizacionServiceInterface {

	@Autowired
	ConvertidorCotizacion mapearCotizacion;

	@Autowired
	CotizacionRepository repositoryCotizacion;

	/**
	 * metodo para crear una cotizacion
	 * @param cotizacionDto, recibe por parametro el cotizacion DTO
	 */
	@Override
	@Transactional
	public void crearCotizacion(CotizacionDTO cotizacionDto) {
		
		cotizacionDto.setEstado(EstadoCotizacionEnum.ACTIVO);
		Cotizacion cotizacion = mapearCotizacion.convertirDtoToEntity(cotizacionDto);

		repositoryCotizacion.save(cotizacion);
	}
	
	
}
