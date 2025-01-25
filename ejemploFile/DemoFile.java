package ejemploFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class DemoFile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String linea = null;
		String nombreArchivo = null;

		System.out.println("Vamos a almacenar una línea de texto");
		System.out.println("Ingresa una línea de texto:");
		linea = teclado.nextLine();
		System.out.println("Ingrese el nombre para el archivo donde se va a guardar la línea:");
		nombreArchivo = teclado.nextLine();
		File objetoFile = new File(nombreArchivo);
		while (objetoFile.exists()) {
			System.out.println("Ya existe un archivo con este nombre " + nombreArchivo);
			System.out.println("Ingresa un nombre diferente:");
			nombreArchivo = teclado.nextLine();
			objetoFile = new File(nombreArchivo);
		}
		PrintWriter flujoDeSalida = null;
		try {

			flujoDeSalida = new PrintWriter(new FileOutputStream(nombreArchivo));
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir un archivo " + nombreArchivo);
			System.exit(0);
		}

		System.out.print("Escribiendo: " + linea);
		System.out.println(" al archivo " + nombreArchivo);
		flujoDeSalida.println(linea);
		flujoDeSalida.close();

		objetoFile = new File("luna.txt");
		System.out.println("El tamaño de mi archivo luna.txt es: " + objetoFile.length() + " bytes");
		objetoFile = new File("Carpeta/MisTrabajos");
		if (objetoFile.mkdirs())//Se encarga de crear un directorio
			System.out.println("Se ha creado un directorio");
		else
			System.out.println("El directorio no ha podido ser creado");
		System.out.println("La ruta del directorio es:" + objetoFile.getAbsolutePath());//Trae la ruta completa del objeto actual
		System.out.println("Se ha completado la escritura.");
	}
}












