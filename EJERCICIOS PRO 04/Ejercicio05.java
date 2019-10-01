public class Ejercicio05 {
  public static void main(String [] args) {
      //Calcular ecuación ax + b = 0
      
      System.out.println("Vamos a calcular la ecuación ax + b = 0, para eso necesito que me des 2 valores: ");
      
      double a;
      System.out.print("Dime cual quieres que sea el primer valor: ");
      a = Double.parseDouble(System.console().readLine());
      
      double b;
      System.out.print("Dime el segundo valor: ");
      b = Double.parseDouble(System.console().readLine());
      
      if (a == 0) {
          System.out.println("Con valor 0 en ''a'' la ecuación no puede ser resuelta");
        } else {
          System.out.println("El resultado de la ecuación es x = " + (-b/a));
        }
       
    }
  }
//Despejamos ecuación (x = -b/a) y el único valor que no es permitible es el de a = 0 porque no se podría resolver ecuación
