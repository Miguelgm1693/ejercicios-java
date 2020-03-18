package ejercicio04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {

  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Uso del programa: Ejercicio04 palabra.txt");
      System.exit(-1);

    }

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));

      ArrayList<String> palabra = new ArrayList<>();

      String linea = "";

      do {
        palabra.add(linea);
        linea = br.readLine();
      } while (linea != null);

      br.close();

      Collections.sort(palabra);

      for (String palabras : palabra) {
        bw.write(palabras + "\n");
      }

      bw.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha encontrado el fichero");
    } catch (IOException ioe) {
      System.out.println("Se ha producido un eror");
    }
  }

}
