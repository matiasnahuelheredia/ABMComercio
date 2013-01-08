package ventas;

import java.io.*;



public class Persistencia {
	/**
	 * guarda un objeto en un archivo binario 
	 * @param obj objeto que se quiere guardar
	 */
public static void GuardarObjeto(Object obj,String nombreArchivo)
{
	try {
		FileOutputStream fos = new FileOutputStream(nombreArchivo+".bin");
	    ObjectOutputStream out = new ObjectOutputStream(fos);
	    out.writeObject(obj);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
     /**
      * 
      * @param obj se ingresa el objeto que se quiere leer para obtener el nombre del archivo
      * @return retorna el objeto que quiere leer
      * @throws IOException
      * @throws ClassNotFoundException
      */
public static Object GetObjeto(Object obj,String nombreArchivo) throws IOException, ClassNotFoundException,FileNotFoundException
{
	FileInputStream fis = new FileInputStream(nombreArchivo+".bin");
	ObjectInputStream in = new ObjectInputStream(fis);
	
	return in.readObject();
	}




}
