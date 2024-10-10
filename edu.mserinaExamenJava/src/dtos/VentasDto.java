package dtos;

import java.time.LocalDate;

/**
 *  Contiene os campos y los metodos de las ventas
 * msm - 101024
 */
public class VentasDto {

	long id;
	int importe = 0;
	long idClienteCompra;
	LocalDate fecha = LocalDate.of(9999, 12, 12);
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public long getIdClienteCompra() {
		return idClienteCompra;
	}
	public void setIdClienteCompra(long idClienteCompra) {
		this.idClienteCompra = idClienteCompra;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public VentasDto(long id, int importe, long idClienteCompra, LocalDate fecha) {
		super();
		this.id = id;
		this.importe = importe;
		this.idClienteCompra = idClienteCompra;
		this.fecha = fecha;
	}
	public VentasDto() {
		super();
	}
	@Override
	public String toString() {
		return "VentasDto [id=" + id + ", importe=" + importe + ", idClienteCompra=" + idClienteCompra + ", fecha="
				+ fecha + "]";
	}
	
	
}
