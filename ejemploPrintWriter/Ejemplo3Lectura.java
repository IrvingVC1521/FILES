package ejemploPrintWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejemplo3Lectura {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		Scanner archivoDeEntrada;
		String nombreArchivo;
		String linea;
		try {
			System.out.print("Introduzca el nombre del archivo: ");
			nombreArchivo = lectura.nextLine();
			archivoDeEntrada = new Scanner(new FileInputStream(nombreArchivo));
			//También se pudo escribir:
			// archivoDeEntrada = new Scanner(new FileReader(nombreArchivo));
			while (archivoDeEntrada.hasNextLine()) {
				linea = archivoDeEntrada.nextLine();
				System.out.println(linea);
			}
			archivoDeEntrada.close(); //Cierra el archivo.
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
