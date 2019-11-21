package buscartesoro;

import java.util.Scanner;

public class BuscarTesoro {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //constantes contenido de las casillas se pone final y en mayuscula
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;

    int x;
    int y;
    int[][] matriz = new int[10][8];

    //iniciar el array
    for (x = 0; x < 9; x++) {
      for (y = 0; y < 7; y++) {
        matriz[x][y] = VACIO;
      }
    }

    //posición mina
    int minaX = (int) (Math.random() * 10);
    int minaY = (int) (Math.random() * 8);
    matriz[minaX][minaY] = MINA;

    //posición tesoro
    int tesoroX;
    int tesoroY;
    do {
      tesoroX = 0;//(int) (Math.random() * 10);
      tesoroY = 1;//(int) (Math.random() * 8);
    } while ((minaX == tesoroX) && (minaY == tesoroY));

    matriz[tesoroX][tesoroY] = TESORO;

    System.out.println("¡ENCUENTRA EL TESORO!");
    boolean salir = false;
    String carac = "";

    do {
      //imprimir matriz
      for (y = 7; y > 0; y--) {
        System.out.print(y + "|");

        for (x = 0; x < 10; x++) {
          if (matriz[x][y] == INTENTO) {
            System.out.print("X ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
      System.out.println(" --------------------\n  0 1 2 3 4 5 6 7 8 9 \n");

      //pedir la coordenada que desea buscar el jugador
      System.out.println("Pon una coordenada X: ");
      x = Integer.parseInt(s.nextLine());
      System.out.println("Pon la coordenada Y: ");
      y = Integer.parseInt(s.nextLine());

      //comprobar que hay en las coordenadas indicadas por el jugador
      switch (matriz[x][y]) {
        case VACIO:
          matriz[x][y] = INTENTO;
          break;
        case MINA:
          System.out.println("Has explotado la mina, juego terminado.");
          salir = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena, has conseguido el tesoro!");
          salir = true;
          matriz[x][y] = TESORO;
          break;
        default:
      }
    } while (!salir);

    //imprimir cuadrante
    for (y = 7; y > 0; y--) {
      System.out.print(y + "|");
      for (x = 0; x < 10; x++) {
        switch(matriz[x][y]) {
          case VACIO:
            carac = "  ";
            break;
          case INTENTO:
            carac = "X ";
            break;
          case TESORO:
            carac = "# ";
            break;
          default:
        }
        System.out.print(carac);
      }
      System.out.println();
    }
    System.out.println(" --------------------\n   0 1 2 3 4 5 6 7 8 9 \n ");
    
  }
}
