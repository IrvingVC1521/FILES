package ejemploBinarios;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class EOFDemo {
	public static void main(String[] args) {
		try {
			ObjectInputStream flujoDeEntrada = new ObjectInputStream(new FileInputStream("lista.dat"));
			int numero;
			System.out.println("Leyendo numeros de lista.dat");
			try {
				while (true) {
					numero = flujoDeEntrada.readInt();
					System.out.println(numero);
				}
			} catch (EOFException e) {
				System.out.println("No hay más números en el archivo.");
			}
			flujoDeEntrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se puede encontrar el archivo lista.dat.");
		} catch (IOException e) {
			System.out.println("Problema leyendo de lista.dat." + e.getMessage());
		}
	}
}