package BufferedReaderDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try {
			BufferedReader flujoDeEntrada = new BufferedReader(new FileReader("luna.txt"));

			String linea = flujoDeEntrada.readLine();
			System.out.println("Se ha obtenido del archivo:");
			System.out.println(linea);
			linea = flujoDeEntrada.readLine();
			System.out.println("Lo siguiente que se ha obtenido es:");
			System.out.println(linea);
			flujoDeEntrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo luna.txt no se ha encontrado");
			System.out.println("o no puede ser abierto.");
			System.out.println("Mensaje en el objeto e " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error leyendo de luna.txt.");
		}
	}
}







