package tema6;

public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Programa que genera números aleatorios pares entre 0 y 100.");
    
    int numero = 0;
    int contador = 0;
    
    while (numero != 24){
      numero = ((int)(Math.random()* 101) / 2);
      System.out.print(numero + " ");
      contador++;
    }
    
    System.out.println("\nSe han generado " + contador + " números.");
  }
}
