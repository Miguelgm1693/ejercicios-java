package ejercicio01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 1; i < 501; i++) {
                if (esPrimo(i)) {
                    bw.write(i + "\n");

                }

            }

            bw.close();

        } catch (IOException ioe) {
            System.out.println("No se puede escribir en el fichero");

        }

    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
