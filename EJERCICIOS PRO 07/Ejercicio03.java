package tema7;

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("En este programa se escribirán 10 números por teclado y invertir su número");
    int[] num = new int[10];
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce el numero numero " + i);
      num[i]= Integer.parseInt(s.nextLine());
    }
    
    for (int j = 9; j >= 0; j--) {
      System.out.println("El numero " + j + " es " + num[j]);
    }
    
  }
}
