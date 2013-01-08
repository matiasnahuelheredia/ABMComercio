package ventas;

import java.io.Serializable;

public class Producto implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -9161847981075840137L;
private int codigo;
private String nombre;
private float precio;
private Proveedor proveedor;
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public Proveedor getProveedor() {
	return proveedor;
}
public void setProveedor(Proveedor proveedor) {
	this.proveedor = proveedor;
}
}
