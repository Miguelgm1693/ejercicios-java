public class Ejercicio17 {
  public static void main(String[]args) {
  
    System.out.println("En este programa vamos a sumar los 100 números siguientes al número introducido.");
  
    int numeroIntroducido = 0;
    System.out.println("Introduzca el número (entero y positivo): ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
  
    do {
      System.out.println("Introduzca el número (entero y positivo): ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido < 0) {
          System.out.println("EL número introducido no es correcto (tiene que ser positivo y entero)");
      } 
    } while (numeroIntroducido < 0);
  
    int suma = 0;
  
    for(int i = numeroIntroducido ; i < numeroIntroducido + 100; i++) {
      suma = suma + i;
    }
  
    System.out.println("La suma de los 100 números siguiente a " + numeroIntroducido + " es de " + suma);
  
  }
}
