package ejemploPrintWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		String nombreArchivo;
		PrintWriter ArchivoDeSalida;

		String texto = "Añadir al final del archivo";
		try {
			System.out.print("Introduzca el nombre del archivo: ");
			nombreArchivo = lectura.nextLine();
			ArchivoDeSalida = new PrintWriter(new FileOutputStream(nombreArchivo, false));
			/*También se puede escribir de la siguiente forma:
			ArchivoDeSalida = new PrintWriter(new FileWriter(nombreArchivo, true))
			true nos indica que el archivo se abre para agregarle información de tal manera que
			no se sobreescribirá, esa información se pasa a la variable boolean append*/
			ArchivoDeSalida.println(texto);
			ArchivoDeSalida.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
