package ejemploPrintWriter;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ArchivoTexto {
	public static void main(String[] args) {
		PrintWriter flujoSalida = null;
		try {

			flujoSalida = new PrintWriter(new FileOutputStream("archivo2.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error al intentar abrir a arhivo2.txt.");
			System.exit(0);
		}
		flujoSalida.println("Ingeniería");
		flujoSalida.println("en Sistemas Computacionales");
		flujoSalida.close();
		System.out.println("Fin del programa");
	}
}
