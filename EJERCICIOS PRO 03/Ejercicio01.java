public class Ejercicio01 {
  public static void main(String [] args) {
      
      int numero1;
      System.out.print("Dime un número ");
      numero1 = Integer.parseInt(System.console().readLine());
      
      int numero2;
      System.out.print("Dame otro número ");
      numero2 = Integer.parseInt(System.console().readLine());
      
      int total;
      total = numero1 * numero2;
      
      System.out.println("El resultado de multiplicar estos dos números es " + total);
    }
  }
