public class Ejercicio19 {
  public static void main(String [] args) {
    // 
      
    System.out.println("En este programa vamos a dar un número el cual nos va a decir de cuántos dígitos se compone dicho número");
    System.out.println("Escriba un número entero (máximo 5 cifras): ");
    int num = Integer.parseInt(System.console().readLine());
    
    if (num < 10) {
      System.out.print("El número se compone de 1 dígito");
      }
      
    if ((num >= 10) && (num < 100)) {
      System.out.print("El número se compone de 2 dígitos");
      }  
    
    if ((num >= 100) && (num < 1000)) {
      System.out.print("El número se compone de 3 dígitos");
      }  
    
    if ((num >= 1000) && (num < 10000)) {
      System.out.print("El número se compone de 4 dígitos");
      }  
    
    if ((num >= 10000) && (num < 100000)) {
      System.out.print("El número se compone de 5 dígitos");
      }  
      
 }   
}

