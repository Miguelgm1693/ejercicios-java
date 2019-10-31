package tema6;

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Programa que muestra números aleatorios entre 100 y 199 y muestre el máximo, el mínimo y la media.");
    
    int numeros = 0;
    int media = 0;
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    for (int i = 0; i < 50; i++) {
      numeros = (int)(Math.random()* 100) + 100;
      System.out.print(numeros + " ");
      suma = suma + numeros;
      media = suma / 50;
      if (numeros < minimo) {
        minimo = numeros;
      }
      if (numeros > maximo) {
        maximo = numeros;
      }
    }
    
    System.out.println("\nMínimo: " + minimo);
    System.out.println("Máximo: " + maximo);
    System.out.println("Media:  " + media);
    
  }
}
