package tema6;

import java.util.Scanner;

public class Ejercicio01 {
  public static void main (String[]args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Programa que tira 3 dados y nos suma el resultado de la tirada total.");
    int dado1 = (int)(Math.random()* 6) + 1;
    int dado2 = (int)(Math.random()* 6) + 1;
    int dado3 = (int)(Math.random()* 6) + 1;
    
    System.out.println("Dado 1: " + dado1);
    System.out.println("Dado 2: " + dado2);
    System.out.println("Dado 3: " + dado3);
    
    int suma = dado1 + dado2 + dado3;
    System.out.println("La total de los dados es de " + suma);
  }
}
