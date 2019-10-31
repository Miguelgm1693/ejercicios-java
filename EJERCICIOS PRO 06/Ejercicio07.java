package tema6;

public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("En este programa haremos tres apuestas de una quiniela.");
    
    int resultado; //variable para el resultado 1 X 2.
    int columnas = 3;
    
    for (int filas = 1; filas < 16; filas++) {
      System.out.print("|");
      if (filas == 15){
        columnas = 1;
      }      
     
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultado = (int) ((Math.random() * 3) + 1);
        switch (resultado){
          case 1: 
            System.out.print(" 1  |");
          break;
          case 2:
            System.out.print("  X |");
          break;  
          case 3:
            System.out.print("   2|");
          default:
        }
      }
      System.out.println();
    }
    
  }  
}
