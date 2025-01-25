package demoScanner;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class DemoHasNextLine
{
   public static void main(String[] args) {
      Scanner flujoDeEntrada = null;
      PrintWriter flujoDeSalida = null;
      
      try {
       flujoDeEntrada = new Scanner(new FileInputStream("luna.txt"));
       // Ejemplo de como se usa en windows, ojo: hay que cambiar los nombres
       // de las carpetas a como están en tu computadora:
       //flujoDeSalida = new PrintWriter(new FileOutputStream("C:\\Users\\nh_22\\Documents\\luna2.txt"));
         // Notación a ser usada en macOs o Linux:
       flujoDeSalida = new PrintWriter(new FileOutputStream("C:\\Users\\irvin\\IdeaProjects\\Files\\luna2.txt"));
      } catch(FileNotFoundException e) {
         System.out.println("Problema al abrir los archivos." + e.getMessage());
         System.exit(0);
      }
      String linea = null;
      int contador = 0;
      while (flujoDeEntrada.hasNextLine( )) {
         linea = flujoDeEntrada.nextLine( );
         contador++;
         flujoDeSalida.println(contador + " " + linea);
      }
      flujoDeEntrada.close( );
      flujoDeSalida.close( );
      System.out.println("La copia ha concluido");
    }
}





