package com.obrasciviles.sensu.dto;

public class CotizacionDTO {
	
	private String nombreCliente;
	
	private double Valor;


	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return Valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		Valor = valor;
	}
	
	
	

}
