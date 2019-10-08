public class Ejercicio17 {
  public static void main(String [] args) {
    // Vamos a utilizar % ya que con esto conseguimos el resto de una división y así conseguir la última cifra del número que escribamos
      
    System.out.println("En este programa vamos a dar un número el cual nos va a dar la última cifra de ese número");
    
    System.out.println("Escriba un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.println("La última cifra del número escrito es " + ( num % 10));
    
 }   
}

