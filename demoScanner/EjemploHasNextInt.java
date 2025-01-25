package demoScanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class EjemploHasNextInt {
	public static void main(String[] args) {
		Scanner objetoArchivo = null;
		int siguiente, suma = 0;
		try {
			objetoArchivo = new Scanner(new FileInputStream("datos.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("El archivo datos.txt no se ha encontrado");
			System.out.println("o no pudo ser abierto");
			System.exit(0);
		}

		while (objetoArchivo.hasNextInt()) {
			siguiente = objetoArchivo.nextInt();
			suma = suma + siguiente;
		}
		objetoArchivo.close();
		System.out.println("La suma de los valores encontrados en el archivo es:  " + suma);
	}
}








