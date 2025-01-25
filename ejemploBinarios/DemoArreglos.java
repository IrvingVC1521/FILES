package ejemploBinarios;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DemoArreglos {
	public static void main(String[] args) {
		AlgunaClase[] a = new AlgunaClase[3];
		a[0] = new AlgunaClase(1, 'A', "Letrero1");
		a[1] = new AlgunaClase(2, 'B', "Letrero2");
		a[2] = new AlgunaClase(3, 'C', "Letrero3");
		try {
			ObjectOutputStream flujoDeSalida =
					new ObjectOutputStream(new FileOutputStream("vectorAC.dat"));
			flujoDeSalida.writeObject(a);
			flujoDeSalida.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo.");
			System.exit(0);
		}
		System.out.println("El arreglo ha sido escrito en el archivo");
		System.out.println("Abrimos el archivo para desplegar su contenido:");

		AlgunaClase[] b = null;
		try {
			ObjectInputStream flujoDeEntrada =
					new ObjectInputStream(new FileInputStream("vectorAC.dat"));
			b = (AlgunaClase[]) flujoDeEntrada.readObject(); //(AlgunaClase[]), con esto le avisamos que vamos a usar un vector
			//de tipo algunaclase, esto es importante  a la hora de usar vectores
			flujoDeEntrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se puede encontrar el archivo vectorAC.dat");
			System.exit(0);//Se encarga de terminar el programa, es como "hubo un error, salte del programa
		} catch (ClassNotFoundException e) {
			System.out.println("Problemas al leer el archivo.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Problemas con el archivo de entrada.");
			System.exit(0);
		}
		System.out.println("Los siguientes elementos fueron leídos del archivo");
		int i;
		for (i = 0; i <= 2; i++)
			System.out.println(b[i].toString());
		System.out.println("Final del programa.");
	}
}

