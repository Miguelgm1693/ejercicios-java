package tema6;

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Programa que nos hace adivinar un número entre 0 y 100 con 5 oportunidades.");
    System.out.println("Estoy pensando un número entre 0 y 100, dime cual crees que puede ser.");
    int oportunidad = 5;
    int numero = 0;
    int azar = (int)(Math.random()* 101);
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca el número que crea que he pensado: ");
      numero = Integer.parseInt(sc.nextLine());
      oportunidad--;
      
      if ((numero > azar) && (oportunidad > 0)){
        System.out.println("El número introducido es mayor que el número que estoy pensando.");
        System.out.println("Te faltan " + oportunidad + " oportunidades."); 
      }
      if ((numero < azar) && (oportunidad > 0)){
        System.out.println("El número introducido es menor que el número que estoy pensando.");
        System.out.println("Te faltan " + oportunidad + " oportunidades.");
      }
      if (numero == azar){
        acertado = true;
        System.out.println("¡El número introducido es correcto!, ¡Enhorabuena!.");
      } 
    } while (oportunidad > 0);
    
    if (oportunidad == 0){
      System.out.println("Lo sentimos no has acertado el número, el número pensado era " + azar + ".");
    }

  }
}
