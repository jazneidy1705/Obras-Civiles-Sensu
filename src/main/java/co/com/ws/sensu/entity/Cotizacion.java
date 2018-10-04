package co.com.ws.sensu.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "cotizacion")
public class Cotizacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@ManyToOne(fetch = FetchType.LAZY)
	private Proveedor proveedor;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemCotizacion> itemsCotizacion;
	
	public Long getId() {
	return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the itemsCotizacion
	 */
	public List<ItemCotizacion> getItemsCotizacion() {
		return itemsCotizacion;
	}

	/**
	 * @param itemsCotizacion the itemsCotizacion to set
	 */
	public void setItemsCotizacion(List<ItemCotizacion> itemsCotizacion) {
		this.itemsCotizacion = itemsCotizacion;
	}

}
