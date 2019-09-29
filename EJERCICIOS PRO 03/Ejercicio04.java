public class Ejercicio04 {
  public static void main(String [] args) {
      
      int numero1;
      System.out.print("Dime un número ");
      numero1 = Integer.parseInt(System.console().readLine());
      
      int numero2;
      System.out.print("Dame otro número ");
      numero2 = Integer.parseInt(System.console().readLine());
      
      int multi;
      multi = numero1 * numero2;
      
      int divi;
      divi = numero1 / numero2;
      
      int suma;
      suma = numero1 + numero2;
      
      int resta;
      resta = numero1 - numero2;
      
      System.out.println("El resultado de multiplicar estos dos números es " + multi);
      System.out.println("El resultado de dividir estos dos números es " + divi);
      System.out.println("El resultado de sumar estos dos números es " + suma);
      System.out.println("El resultado de restar estos dos números es " + resta);
    }
  }
