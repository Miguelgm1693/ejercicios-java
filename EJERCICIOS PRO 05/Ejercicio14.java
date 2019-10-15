
package Ejercicios.tema5;

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("En este programa vamos a dar una base y un exponente y el programa nos calculará la potencia");
    
    int base = 0;
    System.out.print("Pon la base: ");
    base = (Integer.parseInt(s.nextLine()));
    
    int exponente = 0;
    System.out.print("Pon el exponente: ");
    exponente = (Integer.parseInt(s.nextLine()));
    
    double potencia = 1;
    
    if (exponente == 0) {
      potencia = 1;      
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia = potencia * base;
      }
    }  
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia = potencia * base;
      }
      potencia = 1/potencia;
    }
    
    System.out.println(base + "^" + exponente + "=" + potencia);   
  }
}  
