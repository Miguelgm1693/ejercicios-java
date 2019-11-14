package tema7;

import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Programa que escribe 100 números aleatorios entre 0 y 20");
    
    int[] aleatorio = new int[100];
    
    for (int i = 0; i < 100; i++) {
      aleatorio[i] = (int)(Math.random()*21);
      System.out.print(aleatorio[i] + ", ");
    }
    System.out.println();
    System.out.println("¿Que números desea cambiar?: ");
    int numero = Integer.parseInt(sc.nextLine());
    System.out.println("¿Por que número desea cambiarlo?: ");
    int cambio = Integer.parseInt(sc.nextLine());
    
    for (int i = 0; i < 100; i++) {
      if (aleatorio[i] == numero) {
        aleatorio[i] = cambio;
      }
    }
    
     for (int i = 0; i < 100; i++) {
      System.out.print(aleatorio[i] + ", ");
    }
    
  }
}
