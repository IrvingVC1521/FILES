package ejemploBinarios;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<AlgunaClase> miLista = new ArrayList<>();


        miLista.add(new AlgunaClase(1, 'A', "Letrero 1"));
        miLista.add(new AlgunaClase(2, 'B', "Letrero 2"));
        miLista.add(new AlgunaClase(3, 'C', "Letrero 3"));
        try {
            ObjectOutputStream flujoDeSalida =
                    new ObjectOutputStream(new FileOutputStream("listaAC.dat"));
            flujoDeSalida.writeObject(miLista);
            flujoDeSalida.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            System.exit(0);
        }
        System.out.println("La lista ha sida agregada al archivo");
        System.out.println("Abrimos el archivo para desplegar su contenido:");

        ArrayList<AlgunaClase> miLista2 = new ArrayList<>();
        try {
            ObjectInputStream flujoDeEntrada =
                    new ObjectInputStream(new FileInputStream("listaAC.dat"));
            miLista2 = (ArrayList<AlgunaClase>) flujoDeEntrada.readObject();//(ArrayList<AlgunaClase>) con este avisamos que leeremos un Arraylist
            flujoDeEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo listaAC.dat");
            System.exit(0);
        } catch (ClassNotFoundException e) {
            System.out.println("Problemas al leer el archivo.");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Problemas con el archivo de entrada.");
            System.exit(0);
        }
        System.out.println("Los siguientes elementos fueron leídos del archivo");
        for (AlgunaClase obj : miLista2)
            System.out.println(obj.toString());
        System.out.println("Final del programa.");
    }
}

