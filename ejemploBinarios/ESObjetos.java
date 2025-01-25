package ejemploBinarios;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class ESObjetos {
	public static void main(String[] args) {
		try {
			ObjectOutputStream flujoDeSalida = new ObjectOutputStream(new FileOutputStream("algunaClase.dat"));//Creamos un nuevo archivo
			AlgunaClase unObjeto = new AlgunaClase(1, 'A', "Segundo semestre");
			AlgunaClase otroObjeto = new AlgunaClase(42, 'Z', "Tercer semestre");
			flujoDeSalida.writeObject(unObjeto);
			flujoDeSalida.writeObject(otroObjeto);
			flujoDeSalida.close();
			System.out.println("Los datos se mandaron al archivo.");
		} catch (IOException e) {
			System.out.println("Problema con el archivo de salida.");
		}
		System.out.println("Abrimos el archivo para desplegar sus datos: ");
		try {
			ObjectInputStream flujoDeEntrada = new ObjectInputStream(new FileInputStream("algunaClase.dat"));
			AlgunaClase leerUno = (AlgunaClase) flujoDeEntrada.readObject();
			AlgunaClase leerOtro = (AlgunaClase) flujoDeEntrada.readObject();
			System.out.println("Datos leídos del archivo:");
			System.out.println(leerUno);
			System.out.println(leerOtro.toString());
			flujoDeEntrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se puede encontrar el archivo.");
		} catch (ClassNotFoundException e) {
			System.out.println("Problemas al leer del archivo.");
		} catch (IOException e) {
			System.out.println("Problemas al leer del archivo.");
		}
	}
}
