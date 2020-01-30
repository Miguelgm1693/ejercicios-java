package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabra = new ArrayList<String>();

        System.out.println("Introduzca 10 palabras por teclado: ");
        for (int i = 0; i < 5; i++) {
            palabra.add(sc.nextLine());
        }

        Collections.sort(palabra);
        System.out.println("Palabras ordenadas: ");
        for (String pala : palabra) {
            System.out.println(pala);

        }
    }

}
    

