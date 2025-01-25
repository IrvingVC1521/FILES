package ejemploPrintWriter;

import java.util.Scanner;
import java.io.*;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		String nombreArchivo;
		PrintWriter ArchivoDeSalida;
		String texto = "Ya casi terminamos la materia";
		try {
			System.out.print("Introduzca el nombre del archivo: ");
			nombreArchivo = lectura.nextLine();
			ArchivoDeSalida = new PrintWriter(nombreArchivo);//Abre el archivo
			ArchivoDeSalida.println(texto);//Escribe en el archivo
			ArchivoDeSalida.close();//Cierra el archivo
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
} 
