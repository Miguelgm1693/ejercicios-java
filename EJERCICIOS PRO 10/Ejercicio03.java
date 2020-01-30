package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList<Integer>();

        System.out.println("Introduzca 10 números por teclado: ");
        for (int i = 0; i < 10; i++) {
            numero.add(sc.nextInt());
        }

        Collections.sort(numero);
        System.out.println("Números ordenados: ");
        for (int num : numero) {
            System.out.println("nº: " + num);

        }
    }

}
