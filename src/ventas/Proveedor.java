package ventas;

import java.io.Serializable;



public class Proveedor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -568944111773605158L;
	private int codProveedor;
	private String nombre;
	private String Direccion;
	public int getCodProveedor() {
		return codProveedor;
	}
	public void setCodProveedor(int codProveedor) {
		this.codProveedor = codProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
}
