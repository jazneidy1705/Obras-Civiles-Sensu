package com.obrasciviles.sensu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.obrasciviles.sensu.convertidor.ConvertidorCotizacion;
import com.obrasciviles.sensu.repository.CotizacionRepository;

@Transactional
@Service
public class CotizacionService implements CotizacionServiceInterface{
	
	@Autowired
	ConvertidorCotizacion mapearCotizacion;

	@Autowired
	CotizacionRepository repositoryCotizacion;
}
