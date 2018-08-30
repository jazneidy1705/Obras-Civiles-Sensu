package com.obrasciviles.sensu.convertidor;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import com.obrasciviles.sensu.dto.CotizacionDTO;
import com.obrasciviles.sensu.entity.Cotizacion;
@Component
public class ConvertidorCotizacion {
	
	private final ModelMapper modelMapper = new ModelMapper();
	
	public Cotizacion convertirDtoToEntity(CotizacionDTO cotizacionDto) {
		return modelMapper.map(cotizacionDto, Cotizacion.class);
	}

	
	public CotizacionDTO convertirEntityToDto(Cotizacion cotizacion) {
		return modelMapper.map(cotizacion, CotizacionDTO.class);
	}
	
	public List<CotizacionDTO> convertirListEntityToDto(List<Cotizacion> listCotizaciones){
		Type listaCotizacionType = new TypeToken<List<CotizacionDTO>>() {}.getType();
		return modelMapper.map(listCotizaciones,listaCotizacionType);
	}

}
