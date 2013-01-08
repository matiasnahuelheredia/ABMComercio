package ventas;

import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -2582007136026396122L;
private ArrayList<Producto> listaProductos;
private ArrayList<Cliente> listaCliente;
private ArrayList<Venta> listaVentas;
private ArrayList<Proveedor> listaProveedor;
public ArrayList<Producto> getListaProductos() {
	return listaProductos;
}
public void setListaProductos(ArrayList<Producto> listaProductos) {
	this.listaProductos = listaProductos;
}
public ArrayList<Cliente> getListaCliente() {
	return listaCliente;
}
public void setListaCliente(ArrayList<Cliente> listaCliente) {
	this.listaCliente = listaCliente;
}
public ArrayList<Venta> getListaVentas() {
	return listaVentas;
}
public void setListaVentas(ArrayList<Venta> listaVentas) {
	this.listaVentas = listaVentas;
}
public ArrayList<Proveedor> getListaProveedor() {
	return listaProveedor;
}
public void setListaProveedor(ArrayList<Proveedor> listaProveedor) {
	this.listaProveedor = listaProveedor;
}
}
