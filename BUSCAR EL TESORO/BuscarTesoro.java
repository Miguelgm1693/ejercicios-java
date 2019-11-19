package buscartesoro;

public class BuscarTesoro {

  public static void main(String[] args) {
    //constantes
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;
    
    int x;
    int y;
    int [][] matriz = new int [10][8];
    
    //mina
    int minaX = (int) Math.random() * 10;
    int minaY = (int) Math.random() * 8;
    matriz [minaX][minaY] = MINA;
    
    //tesoro
    int tesoroX;
    int tesoroY;
    do {      
      tesoroX = (int) Math.random() * 10;
      tesoroY = (int) Math.random() * 8;
    } while (minaX == tesoroX && minaY == tesoroY);
    
    matriz [tesoroX][tesoroY] = TESORO;
    
    System.out.println("ENCUENTRA EL TESORO");
    
    //imprimir matriz
    for (y = 8; y > 0; y--) {
      System.out.print(y + "|");
      
      for (int x = 0; x < 10 ; x++) {
      
      }
    
    }
      
  }
  
}
