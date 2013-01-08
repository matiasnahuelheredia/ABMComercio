package ventas;

import java.io.Serializable;

public class Venta implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -3916532697030849684L;
private int codfactura;
private Cliente cliente;
private Producto producto;
public int getCodfactura() {
	return codfactura;
}
public void setCodfactura(int codfactura) {
	this.codfactura = codfactura;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
}
