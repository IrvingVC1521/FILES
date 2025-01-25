package aleatorios;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DemoAleatorios {

	public static void main(String[] args) {
		try {
			RandomAccessFile FlujoEntradaSalida = new RandomAccessFile("aleatorios.dat", "rw");
			System.out.println("Escribiendo 3 bytes en el archivo aleatorio.dat.");
			FlujoEntradaSalida.writeByte(1);
			FlujoEntradaSalida.writeByte(2);
			FlujoEntradaSalida.writeByte(3);
			System.out.println("El archivo tiene una longitud de = " + FlujoEntradaSalida.length() + " bytes ");
			System.out.println("El puntero del archivo está en la posición= " + FlujoEntradaSalida.getFilePointer());
			System.out.println("Moviendo el puntero del archivo a la posición 1.");
			FlujoEntradaSalida.seek(1);
			byte unByte = FlujoEntradaSalida.readByte();
			System.out.println("El valor en la locación 1 es: " + unByte);
			unByte = FlujoEntradaSalida.readByte();
			System.out.println("El valor en la locación siguiente es:  " + unByte);
			System.out.println("Ahora vamos a mover el puntero del archivo hacia atrás,");
			System.out.println("a la locación 1 y vamos a cambiar el byte.");
			FlujoEntradaSalida.seek(1);
			FlujoEntradaSalida.writeByte(9);
			FlujoEntradaSalida.seek(1);
			unByte = FlujoEntradaSalida.readByte();
			System.out.println("El valor de la locación 1 es " + unByte);
			System.out.println("Ahora vamos al final del archivo");
			System.out.println("y escribiremos un double.");
			FlujoEntradaSalida.seek(FlujoEntradaSalida.length());
			FlujoEntradaSalida.writeDouble(41.99);
			FlujoEntradaSalida.writeChar(123);
			FlujoEntradaSalida.writeDouble(100);
			System.out.println("La longitud del archivo es: "
					+ FlujoEntradaSalida.length() + " bytes");
			System.out.println("Retornando a la locación 3,");
			System.out.println("donde escribimos un double.");
			FlujoEntradaSalida.seek(3);
			double unDouble = FlujoEntradaSalida.readDouble();
			System.out.println("El valor de la locación es 3: " + unDouble);
			FlujoEntradaSalida.seek(13);
			unDouble = FlujoEntradaSalida.readDouble();
			System.out.println("El valor de la locación es 13: " + unDouble);
			FlujoEntradaSalida.seek(11);
			char car = FlujoEntradaSalida.readChar();
			System.out.println("El valor de la locación es 11: " + car);

			FlujoEntradaSalida.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir el archivo");
		} catch (IOException e) {
			System.out.println("Problema en E/S con el archivo.");
		}
		System.out.println("Fin del programa.");
	}
}
