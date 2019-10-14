public class Ejercicio11 {
 public static void main(String[]args) {
   
   System.out.println("Este programa nos mostrará el cuadrado y el cubo de 5 números");
   
   System.out.print("Introduzca un número: ");
   int numero = 0;
   numero = Integer.parseInt(System.console().readLine());
   
   for (int i = numero; i < numero + 5; i++) {
     System.out.printf("%10d %10d %10d\n", i, i*i, i*i*i );
   }
 }
}
