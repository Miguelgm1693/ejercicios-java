
package ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            
            String linea = "";
            
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            
            br.close();
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encuentra el fichero primos.dat");
            
        } catch (IOException ioe) {
            System.out.println("No se puede leer el fichero primos.dat");
        }
    }
    
}
