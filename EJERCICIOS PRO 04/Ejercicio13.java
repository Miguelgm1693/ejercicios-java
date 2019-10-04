public class Ejercicio13 {
  public static void main(String[]args) {
 
   System.out.println("Este programa nos ordenará los tres números que vamos a introducir.");
      
   int a;
   System.out.println("Introduzca el primer número: ");
   a = Integer.parseInt(System.console().readLine());
   
   int b;
   System.out.println("Introduzca el segundo número: ");
   b = Integer.parseInt(System.console().readLine());
   
   int c;
   System.out.println("Introduzca el tercer número: ");
   c = Integer.parseInt(System.console().readLine());  
   
   if ((a > b) && (b > c)) {
      System.out.println("El resultado de su numeración ordenada es: " + a + ", " + b + ", " + c + ".");
     } else if ((a < b) && (b < c)) {
      System.out.println("El resultado de su numeración ordenada es: " + c + ", " + b + ", " + a + "."); 
     } else if ((a > b) && (c > a)) {
      System.out.println("El resultado de su numeración ordenada es: " + c + ", " + a + ", " + b + "."); 
     } else if ((a < b) && (c < b) && (c > a)) {
      System.out.println("El resultado de su numeración ordenada es: " + b + ", " + c + ", " + a + "."); 
     } else if ((c < a) && (a > b) && (c > b)) {
      System.out.println("El resultado de su numeración ordenada es: " + a + ", " + c + ", " + b + "."); 
     } else if ((b > a) && (b > c) && ( c < a)) {
      System.out.println("El resultado de su numeración ordenada es: " + b + ", " + a + ", " + c + "."); 
     } 
   
 }
}
  
