package tema7;

import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] primo = new int[20];
    int[] noPrimo = new int[20];
    int[] aleatorio = new int[20];
    int contadorPrimo = 0;
    int contadorNoPrimo = 0;

    for (int i = 0; i < 20; i++) {
      aleatorio[i] = (int) (Math.random() * 101);
      System.out.print(aleatorio[i] + " ");
      if (esPrimo(aleatorio[i])) {
        primo[contadorPrimo] = aleatorio[i];
        contadorPrimo++;
      } else {
        noPrimo[contadorNoPrimo] = aleatorio[i];
        contadorNoPrimo++;
      }
    }
    
    for (int i = 0; i < contadorPrimo; i++) {
      aleatorio[i] = primo[i];
    }
    for (int i = 0; i < contadorNoPrimo; i++) {
      aleatorio[contadorPrimo + i] = noPrimo[i];
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.print(aleatorio[i] + " \n");
      
    }

  }

  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
}
