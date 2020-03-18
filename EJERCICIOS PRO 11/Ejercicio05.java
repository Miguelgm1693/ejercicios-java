
package ejercicio05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio05 {

  public static void main(String[] args) {
    
    if (args.length != 2) {
      System.out.println("Uso del programa: Ejercicio05 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
      System.exit(-1);
    }
    
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
      
      String lineaOrigen = "";
      String lineaDestino = "";
      
      boolean comentario = false;
      int i = 0;
      
      while ((lineaOrigen = br.readLine()) != null) {
        
        int l = lineaOrigen.length();
        lineaDestino = lineaOrigen;

        if ((i = lineaOrigen.indexOf("/*")) != -1) {
          comentario = true;
          lineaDestino = lineaOrigen.substring(0, i);
          lineaOrigen = lineaDestino;
        }
        
         
        if ((i = lineaOrigen.indexOf("*/")) != -1) {
          comentario = false;
          lineaDestino = lineaOrigen.substring(i + 2, l);
        }
        
        if (((i = lineaOrigen.indexOf("//")) != -1) && !comentario) {
          lineaDestino = lineaOrigen.substring(0, i);
        }

        if (!comentario) {
          bw.write(lineaDestino + "\n");
        }
      }
      
      br.close();
      bw.close();
      
    } catch (IOException ioe) {
        System.out.println("Se ha producido un error");
    }
  }
  
}
