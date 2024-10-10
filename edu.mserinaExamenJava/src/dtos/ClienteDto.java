package dtos;

/**
 * Contiene os campos y los metodos de los clientes
 * msm - 101024
 */
public class ClienteDto {

	long id;
	String Nombre = "AAAA";
	String Apellidos = "aaaaa";
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	public ClienteDto(long id, String nombre, String apellidos) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellidos = apellidos;
	}
	
	public ClienteDto() {
		super();
	}
	
	@Override
	public String toString() {
		return "ClienteDto [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + "]";
	}
	
	

	
	
	
}
