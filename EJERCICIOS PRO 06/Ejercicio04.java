package tema6;

public class Ejercicio04 {
  public static void main(String[] args) {
    
    System.out.println("Programa que muestra 20 números enteros entre 0 y 10.");
    
    for (int i = 0; i < 20; i++) {
      int numero = (int)(Math.random()* 10) + 1;
      System.out.println(numero + " ");
    }
    
  }
}
