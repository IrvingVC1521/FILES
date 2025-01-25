package ejemploBinarios;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DemoLectura {
	public static void main(String[] args) {

		try {
			ObjectInputStream flujoDeEntrada = new ObjectInputStream(new FileInputStream("lista.dat"));
			System.out.println("Leyendo números desde lista.dat.");
			int n1 = flujoDeEntrada.readInt();
			int n2 = flujoDeEntrada.readInt();
			int n3 = flujoDeEntrada.readInt();
			System.out.println("Números que se obtuvieron desde el archivo:");
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			flujoDeEntrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se puede encontrar el archivo lista.dat");
		} catch (IOException e) {
			System.out.println("Problemas al leer desde lista.dat");
		}
		System.out.println("Fin de programa.");
	}
}