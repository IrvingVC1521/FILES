package demoScanner;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EjemploScanner {
    public static void main(String[] args) {
       int n1, n2, n3;
       String linea;
       System.out.println("A continuación se leerán 3 números y una línea de texto");
       System.out.println("del archivo cosas.txt");
       Scanner flujoDeEntrada = null;
       try {
          flujoDeEntrada = new Scanner(new FileInputStream("cosas.txt"));//Sirve para obtener ciertas caracteristicas de un archivo o
          //crear un directorio
       } catch (FileNotFoundException e) {
          System.out.println("El archivo cosas.txt no se encontró");
          System.out.println("o no se puede abrir.");
          System.exit(0);
       }
       n1 = flujoDeEntrada.nextInt();
       n2 = flujoDeEntrada.nextInt();
       n3 = flujoDeEntrada.nextInt();
       linea = flujoDeEntrada.nextLine();

       System.out.println("Los tres números leídos del archivo fueron:");
       System.out.println(n1 + ", " + n2 + ", y " + n3);
       System.out.println("La linea que se leyó fue:");
       System.out.println(linea);
       flujoDeEntrada.close();
    }
}