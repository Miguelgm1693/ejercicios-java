
package Ejercicios.tema5;

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("En este programa vamos a leer una lista de diez números y éste determinará cuántos son positivos y cuántos negativos");
    
    int positivos = 0;
    int negativos = 0;
    
    System.out.println("Introduzca 10 números enteros (negativos y positivos):");    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(s.nextLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Hay " + negativos + " números negativos y " + positivos + " números positivos");
  }
  
}
