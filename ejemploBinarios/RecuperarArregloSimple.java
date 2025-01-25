package ejemploBinarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RecuperarArregloSimple {
	
	public static void main(String args[]) 
	{
		double listado[ ];

		ObjectInputStream objetoArchivo = null;
		
		try{
			objetoArchivo = new ObjectInputStream(new FileInputStream  ("arreglo.dat"));
			listado= (double[])(objetoArchivo.readObject());
			objetoArchivo.close();
			imprimir (listado);
			
		}
		catch(IOException e)
		{
			System.out.println("El archivo no se ha podido abrir");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error al leer el arreglo desde el archivo");
		}
		
		
	}

	private static void imprimir(double[] listado) {
		for(double elemento:listado)
		{
			System.out.println(elemento);
		}
	}

}
