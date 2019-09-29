public class Ejercicio06 {
  public static void main(String [] args) {
      
      double base;
      System.out.print("¿Cuál es la base del triángulo? ");
      base = Double.parseDouble(System.console().readLine());
      
      double altura;
      System.out.print("¿Y la altura? ");
      altura = Double.parseDouble(System.console().readLine());
              
      System.out.println("El area del triángulo es " + (base * altura) / 2);
    }
  }
