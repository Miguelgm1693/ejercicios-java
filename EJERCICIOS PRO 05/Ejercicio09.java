public class Ejercicio09 {
  public static void main(String[]args) {
    
    System.out.println("En este programa vamos a saber de cuántos dígitos se compone el número que introducimos por teclado.");
    
    int num;
    System.out.println("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    int numConsola = num; 
       
    int numDeDigitos = 0;   
    System.out.println(num);
     
    while (num > 0) {
      num /= 10;
      numDeDigitos++;
    } 
    
    System.out.print("El número " + numConsola + " tiene " + numDeDigitos + " dígitos.");
  }
}
