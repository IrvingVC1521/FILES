package BufferedReaderDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) {
		try {
			BufferedReader flujoDeEntrada = new BufferedReader(new FileReader("luna.txt"));
			PrintWriter flujoDeSalida = new PrintWriter(new FileOutputStream("numerado.txt"));
			int contador = 0;
			String linea = flujoDeEntrada.readLine();
			while (linea != null) {
				contador++;
				flujoDeSalida.println(contador + " " + linea);
				linea = flujoDeEntrada.readLine();
			}
			flujoDeEntrada.close();
			flujoDeSalida.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir los archivos.");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error leyendo desde original.txt.");
		}
	}
}