package com.obrasciviles.sensu.excepciones;

public class SensuException extends RuntimeException{

	
	private static final long serialVersionUID = -5648665131315591568L;

	public SensuException(String mensaje) {
		super(mensaje);
	}
	
}
