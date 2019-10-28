package tema6;

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Programa que nos dirá una carta al azar de la baraja francesa");
    
    String palo = "";
    String carta = "";
   
    int numeroPalo = (int)(Math.random()* 4) + 1; 
    switch (numeroPalo) {
      case 1: 
        palo = "Picas";
        break;  
      case 2:
        palo = "Treboles";
        break;  
      case 3:
        palo = "Diamantes";
        break;
      case 4:
        palo = "Corazones";
        break;
    }
    
    int numeroCarta = (int)(Math.random()* 13) + 1;
    switch (numeroCarta) {
      case 1: 
        carta = "As";
        break;
      case 10:
        carta = "J";
        break;
      case 11:
        carta = "Q";
        break;
      case 12:
        carta = "K";
        break;
      default: carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + palo);
    
  }   
}
