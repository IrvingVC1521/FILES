package ejemploBinarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class DemoArreglosSimples {
	public static void main(String args[])
	{
		double vector[ ] = new double [20];
		ObjectOutputStream objetoArchivo;
		
		for(int i = 0; i < 20; i ++)
		{
			vector[i]= Math.random()*10+1;
			System.out.println(vector[i]);
		}
		try{
			objetoArchivo = new ObjectOutputStream(new FileOutputStream  ("arreglo.dat"));
			objetoArchivo.writeObject(vector);
			objetoArchivo.close();
		}
		catch(IOException e)
		{
			System.out.println("El archivo no se ha podido abrir");
		}
		
	}

}
