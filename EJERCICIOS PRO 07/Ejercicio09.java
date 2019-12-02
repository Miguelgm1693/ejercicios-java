package tema7;

import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[8];
    System.out.println("Introduzca 8 números enteros:");

    for (int i = 0; i < 8; i++) {
      num[i] = Integer.parseInt(sc.nextLine());
    }

    for (int i = 0; i < 8; i++) {
      System.out.print(num[i]);
      if (num[i] % 2 == 0) {
        System.out.print(" es par\n");
      } else {
        System.out.print(" es impar\n");
      }
    }
    System.out.println();
  }

}
