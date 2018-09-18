package co.com.ws.sensu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import co.com.ws.state.EstadoSolicitud;

@Entity
@Table(name = "solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * fecha de creacion de la solicitud
     */
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @Temporal(TemporalType.TIME)
    private Date horaCreacion;

    /**
     * nombre de la persona que solicita la cotizacion
     */
    @Column(nullable = false, length = 100)
    @Size(max = 100)
    private String solicita;

    /**
     * Observaciones o notas a tener en cuenta de la solicitud creada.
     */
    @Column(length = 512)
    @Size(max = 512)
    private String observaciones;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private EstadoSolicitud estado;
    
    @Column(columnDefinition = "TINYINT")
    private int codigoEstado;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Date getFechaCreacion() {
	return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
    }

    public Date getHoraCreacion() {
	return horaCreacion;
    }

    public void setHoraCreacion(Date horaCreacion) {
	this.horaCreacion = horaCreacion;
    }

    public String getSolicita() {
	return solicita;
    }

    public void setSolicita(String solicita) {
	this.solicita = solicita;
    }

    public String getObservaciones() {
	return observaciones;
    }

    public void setObservaciones(String observaciones) {
	this.observaciones = observaciones;
    }

    public EstadoSolicitud getEstado() {
	return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
	this.estado = estado;
    }

    public int getCodigoEstado() {
        return getEstado().getEstado();
    }
    
    

}
