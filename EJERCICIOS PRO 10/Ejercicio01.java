package ejercicio01;

import java.util.ArrayList;

public class Ejercicio01 {

    public static void main(String[] args) {

        ArrayList<String> nombre = new ArrayList();
        nombre.add("Fran");
        nombre.add("Luca");
        nombre.add("Victor");
        nombre.add("Miguel");
        nombre.add("Javi");

        for (String ali : nombre) {
            System.out.println(ali);
        }

    }

}
