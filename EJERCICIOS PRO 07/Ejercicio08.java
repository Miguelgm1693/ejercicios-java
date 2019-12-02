package tema7;

import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {
    System.out.println("Programa al que le diremos la temperatura y hará una gráfica");
    Scanner sc = new Scanner(System.in);

    int[] temperatura = new int[12];
    int i, j;
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };

    for (i = 0; i < 12; i++) {
      System.out.println("Temperatura media del mes de " + mes[i] + ":");
      temperatura[i] = Integer.parseInt(sc.nextLine());
    }

    for (i = 0; i < 12; i++) {
      System.out.printf("%10s" + "|", mes[i]);
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print("█");
      }
      System.out.println();
    }

  }

}
