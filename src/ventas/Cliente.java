package ventas;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 5987889373857899218L;
private int  DNI;
private String  nombre;
private String apellido;
private String  direccion;
private Date fechanacim;
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public Date getFechanacim() {
	return fechanacim;
}
public void setFechanacim(Date fechanacim) {
	this.fechanacim = fechanacim;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int dNI) {
	DNI = dNI;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
