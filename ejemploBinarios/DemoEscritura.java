package ejemploBinarios;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoEscritura {
	public static void main(String[] args) {
		try {
			ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("lista.dat", false));
			for (int i = 1; i <= 30; i++) {
				flujoSalida.writeInt(i * 10);
			}
			System.out.println("Números escritos en el archivo lista.dat.");
			flujoSalida.close();
		} catch (IOException e) {
			System.out.println("Problema con el archivo de salida.");
		}
	}
}
 
