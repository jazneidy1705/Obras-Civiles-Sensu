package com.obrasciviles.sensu.dto;

import java.util.Date;

import com.obrasciviles.sensu.util.EstadoCotizacionEnum;

public class CotizacionDTO {
	
	private String nombreCliente;
	
	private double Valor;
	
	private Date createAt;
	
	private EstadoCotizacionEnum  estado;

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

	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * @return the estado
	 */
	public EstadoCotizacionEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoCotizacionEnum estado) {
		this.estado = estado;
	}
	
	
	

}
