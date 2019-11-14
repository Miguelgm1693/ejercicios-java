package tema7;

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Programa que pide 15 números por teclado y cambiar de posición.");
    
    int [] num = new int[15];
    
    System.out.println("Introduzca 15 números: ");
    for (int i = 0; i < 15; i++) {
      num [i] = Integer.parseInt(sc.nextLine());
    }
    
    // vamos restando posiciones
    for (int i = 14; i > 0; i--) {
      int aux = num[i];
      num[i] = num[i-1];
      num[i-1] = aux;
    }
    
    for (int i = 0; i < 15; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
