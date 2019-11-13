package tema7;

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
 
    System.out.println("Introduzcir 10 nñumeros por teclado y te dirá cuál es el máximo y cuál el mínimo");
    int [] numero  = new int[10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    System.out.println("Introduzca 10 números enteros: ");
    for (int i = 0; i < 10; i++) {
      numero [i] = Integer.parseInt(sc.nextLine());
      
      if (numero = max) {
        System.out.println("El máximo es " + numero);
      }
      
    }
    
    System.out.println("");
  }
  
}
