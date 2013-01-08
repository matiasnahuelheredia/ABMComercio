package ventas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmpresaApp {
	public static String Preguntar(String preguntar) throws IOException
	{
		System.out.println(preguntar);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine(); 
		return linea;
	}
	public static boolean validarOpcion(String Opcion)
	{
		boolean respuesta= false;
		if (Opcion.equals("1")||Opcion.equals("2")||Opcion.equals("3")||Opcion.equals("4")||Opcion.equals("5"))
		{
			respuesta = true;
		}
	return respuesta;	
	}
	public static boolean validarDate(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        String strFecha = fecha;
	        @SuppressWarnings("unused")
			Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(strFecha);
	            return true;
	        } catch (ParseException ex) {
	            return false;
	        }
	    }
	public static Date DeStringADate(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        String strFecha = fecha;
	        Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(strFecha);
	            return fechaDate;
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	            return fechaDate;
	        }
	    }
	public static boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException nfe) {}
	    return false;
	}
	public static int PreguntaEntero(String preguntar) throws IOException
	{
		String linea;
		do{
		System.out.println(preguntar);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 linea = br.readLine();
		
		}while (isInteger(linea)==false);
		return Integer.parseInt(linea);
	}
	public static ArrayList<Cliente> ABMCliente (ArrayList<Cliente> lista) throws IOException
	{
		ArrayList<Cliente> ListaAux= lista;
		String Opcion="";
		while(!(Opcion.equals("1")||Opcion.equals("2")||Opcion.equals("3")||Opcion.equals("4")))
		{System.out.println("ABM Productos");
		System.out.println("1-Alta");
		System.out.println("2-baja");
		System.out.println("3-modificacion");
		System.out.println("4-mostrar");
		Opcion = Preguntar("ingrese opcion");
		}
		if (Opcion.equals("1"))
		{
			Cliente nuevoCliente = new Cliente();
			System.out.println("Nuevo Cliente");
			nuevoCliente.setDNI(PreguntaEntero("ingrese DNI:"));
			nuevoCliente.setNombre(Preguntar("ingrese nombre:"));
			nuevoCliente.setDireccion(Preguntar("ingrese direccion:"));
			nuevoCliente.setApellido(Preguntar("ingrese Apellido:"));
			String fecha="";
			while (validarDate(fecha)==false)
			{
			fecha = Preguntar("ingrese fecha nacimiento");}
			
			nuevoCliente.setFechanacim(DeStringADate(fecha));
			
			
			ListaAux.add(nuevoCliente);
		}
		if (Opcion.equals("2"))
		{ 
				 Cliente miCliente = new Cliente();
				 miCliente.setDNI(PreguntaEntero("ingrese DNI"));
		   int count=0;
		   int remover=0;
		   boolean borrar = false;
		   for( Iterator<Cliente> it = ListaAux.iterator(); it.hasNext(); ) { 
				 Cliente ProvisClien = (Cliente)it.next();
		         
				 if(ProvisClien.getDNI()==miCliente.getDNI())
				 {
					 remover=count;
					 borrar=true;
				 }
				 count++;
			}
		   if (borrar)
		   {
		   ListaAux.remove(remover);
		   
		   }
		}
		
		if (Opcion.equals("4"))
		{
			for( Iterator<Cliente> it = ListaAux.iterator(); it.hasNext(); ) { 
				 Cliente ProvisClien = (Cliente)it.next();
		   System.out.println("------------------------------------");
		   System.out.println("DNI: "+ProvisClien.getDNI());
		   System.out.println("Nombre: "+ProvisClien.getNombre());
		   System.out.println("Apellido: "+ProvisClien.getApellido());
		   System.out.println("Direccion: "+ProvisClien.getDireccion());
		   System.out.println("------------------------------------");
			}
		}
		
		
		return ListaAux;
	}

	public static ArrayList<Proveedor> ABMProveedor (ArrayList<Proveedor> lista) throws IOException
	{
		ArrayList<Proveedor> ListaAux= lista;
		String Opcion="";
		while(!(Opcion.equals("1")||Opcion.equals("2")||Opcion.equals("3")||Opcion.equals("4")))
		{System.out.println("ABM Proveedor");
		System.out.println("1-Alta");
		System.out.println("2-baja");
		System.out.println("3-modificacion");
		System.out.println("4-mostrar");
		Opcion = Preguntar("ingrese opcion");
		}
		if (Opcion.equals("1"))
		{
			Proveedor nuevoProveedor = new Proveedor();
			System.out.println("Nuevo Proveedor");
			nuevoProveedor.setCodProveedor(PreguntaEntero("ingrese CodigoProveedor:"));
			nuevoProveedor.setNombre(Preguntar("ingrese nombre:"));
			nuevoProveedor.setDireccion(Preguntar("ingrese direccion:"));
			
			
			ListaAux.add(nuevoProveedor);
		}
		if (Opcion.equals("2"))
		{ 
				 Proveedor miProveedor = new Proveedor();
				 miProveedor.setCodProveedor(PreguntaEntero("ingrese Codigo"));
		   int count=0;
		   int remover=0;
		   boolean borrar = false;
		   for( Iterator<Proveedor> it = ListaAux.iterator(); it.hasNext(); ) { 
				 Proveedor ProvisClien = (Proveedor)it.next();
		         
				 if(ProvisClien.getCodProveedor()==miProveedor.getCodProveedor())
				 {
					 remover=count;
					 borrar=true;
				 }
				 count++;
			}
		   if (borrar)
		   {
		   ListaAux.remove(remover);
		   
		   }
		}
		
		if (Opcion.equals("4"))
		{
			for( Iterator<Proveedor> it = ListaAux.iterator(); it.hasNext(); ) { 
				 Proveedor ProvisProveedor = (Proveedor)it.next();
		   System.out.println("------------------------------------");
		   System.out.println("Codigo Proveedor: "+ProvisProveedor.getCodProveedor());
		   System.out.println("Nombre: "+ProvisProveedor.getNombre());
		   System.out.println("Direccion: "+ProvisProveedor.getDireccion());
		   System.out.println("------------------------------------");
			}
		}
		
		
		return ListaAux;
	}
	
	
	public static ArrayList<Producto> ABMProducto (ArrayList<Producto> listaprod,ArrayList<Proveedor> listaprov) throws IOException
	{
		ArrayList<Producto> ListaAux= listaprod;
		String Opcion="";
		while(!(Opcion.equals("1")||Opcion.equals("2")||Opcion.equals("3")||Opcion.equals("4")))
		{System.out.println("ABM Producto");
		System.out.println("1-Alta");
		System.out.println("2-baja");
		System.out.println("3-modificacion");
		System.out.println("4-mostrar");
		Opcion = Preguntar("ingrese opcion");
		}
		if (Opcion.equals("1"))
		{
			Producto nuevoProducto = new Producto();
			Proveedor miProveedor = new Proveedor();
			System.out.println("Nuevo Producto");
			nuevoProducto.setCodigo(PreguntaEntero("ingrese Codigo Producto:"));
			nuevoProducto.setNombre(Preguntar("ingrese nombre:"));
			nuevoProducto.setPrecio((float) PreguntaEntero("ingrese precio Producto:"));
			miProveedor.setCodProveedor(PreguntaEntero("ingrese Codigo Proveedor:"));
			    for( Iterator<Proveedor> it = listaprov.iterator(); it.hasNext(); ) { 
				   Proveedor ProvisProve = (Proveedor)it.next();
				   if (miProveedor.getCodProveedor()==ProvisProve.getCodProveedor())
				   {
					   miProveedor= ProvisProve;
				   }
			    }		
			nuevoProducto.setProveedor(miProveedor);
			
			ListaAux.add(nuevoProducto);
		}
		if (Opcion.equals("2"))
		{ 
				 Proveedor miProveedor = new Proveedor();
				 miProveedor.setCodProveedor(PreguntaEntero("ingrese Codigo Proveedor"));
		   int count=0;
		   int remover=0;
		   boolean borrar = false;
		   for( Iterator<Producto> it = ListaAux.iterator(); it.hasNext(); ) { 
				 Producto ProvisClien = (Producto)it.next();
		         
				 if(ProvisClien.getCodigo()==miProveedor.getCodProveedor())
				 {
					 remover=count;
					 borrar=true;
				 }
				 count++;
			}
		   if (borrar)
		   {
		   ListaAux.remove(remover);
		   
		   }
		}
		
		if (Opcion.equals("4"))
		{
			for( Iterator<Producto> it = ListaAux.iterator(); it.hasNext(); ) { 
				 Producto ProvisProducto = (Producto)it.next();
		   System.out.println("------------------------------------");
		   System.out.println("Codigo Proveedor: "+ProvisProducto.getCodigo());
		   System.out.println("Nombre: "+ProvisProducto.getNombre());
		   System.out.println("Precio: "+ProvisProducto.getPrecio());
		   System.out.println("Codigo Proveedor: "+ProvisProducto.getProveedor().getCodProveedor());
		   System.out.println("nombre proveedor: "+ProvisProducto.getProveedor().getNombre());
		   System.out.println("Direccion Proveedor: "+ProvisProducto.getProveedor().getDireccion());
		   System.out.println("------------------------------------");
			}
		}
		
		
		return ListaAux;
	}
	
	public static void main(String[] args) throws IOException {
		Empresa miEmpresa = new Empresa();
		ArrayList<Cliente> listaClien = new ArrayList<Cliente>();
		listaClien = null;
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos = null;
		ArrayList<Proveedor> listaProveedor = new ArrayList<Proveedor>();
		listaProveedor = null;
		ArrayList<Venta> listaVenta = new ArrayList<Venta>();
		listaVenta = null;
		/**
		 * recuperar cambios
		 */
		try {
			miEmpresa = (Empresa) Persistencia.GetObjeto(miEmpresa, "miEmpresa");
			listaClien = miEmpresa.getListaCliente();
			listaProductos = miEmpresa.getListaProductos();
			listaProveedor = miEmpresa.getListaProveedor();
			listaVenta = miEmpresa.getListaVentas();
			
		} catch (FileNotFoundException e) {
		}  catch (ClassNotFoundException e) {
		}
		
		String Opcion="";
		while (Opcion.equals("5")==false)
		{
			do
			{
				System.out.println("---menu principal-----");
				System.out.println("1-Realizar nueva venta");
				System.out.println("2-ABM cliente");
				System.out.println("3-ABM producto");
				System.out.println("4-ABM proveedores");
				System.out.println("5-Exit");
				Opcion = Preguntar("Elige una opcion");
			}while(validarOpcion(Opcion)==false);
			
			
			if (Opcion.equals("2"))
			{
				 listaClien = ABMCliente(listaClien);
				 System.out.println("ABM finalizado");
				 miEmpresa.setListaCliente(listaClien);
			}
			if (Opcion.equals("3"))
			{
				 listaProductos = ABMProducto(listaProductos,listaProveedor);
				 System.out.println("ABM finalizado");
				 miEmpresa.setListaProveedor(listaProveedor);
			}
			
			if (Opcion.equals("4"))
			{
				 listaProveedor = ABMProveedor(listaProveedor);
				 System.out.println("ABM finalizado");
				 miEmpresa.setListaProveedor(listaProveedor);
			}
			
		}
		Persistencia.GuardarObjeto(miEmpresa, "miEmpresa");

	}

}
