public class Ejercicio14 {
  public static void main(String[]args) {
   
   /*En este ejercicio utilizaremos % porque con él lo que se hace es sacar 
     el modulo de ese número o lo que es el resto de una división.*/
     
   System.out.println("Este programa nos dirá si el número introducido es par y si es divisible entre 5.");
      
   int a;
   System.out.println("Introduzca el número que desee saber: ");
   a = Integer.parseInt(System.console().readLine());
   
   if ((a % 2) == 0) {
      System.out.print(a + " es par");
     } else {
      System.out.print(a + " es impar");
     }
   
   if ((a % 5) == 0) {
      System.out.println(" y es divisible entre 5.");
     } else {
      System.out.println(" y no es divisible entre 5.");
     }
 }
}
  
