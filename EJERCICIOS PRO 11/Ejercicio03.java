package ejercicio03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("[FICHERO1] [FICHERO2] [FICHERO3]");
            System.exit(-1);
        }

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(args[2]));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 != null) || (linea2 != null)) {

                linea1 = br1.readLine();
                linea2 = br2.readLine();

                if (linea1 != null) {
                    bw1.write(linea1 + "\n");
                }

                if (linea2 != null) {
                    bw1.write(linea2 + "\n");
                }

            }

            br1.close();
            br2.close();
            bw1.close();

            System.out.println("Archivo creado satisfactoriamente");

        } catch (IOException ioe) {
            System.out.println("Se ha producido un error");
        }

    }

}
