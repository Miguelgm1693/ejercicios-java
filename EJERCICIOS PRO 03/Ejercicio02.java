public class Ejercicio02 {
  public static void main(String [] args) {
      
      double euros;
      System.out.print("Pon la cantidad en Euros a convertir ");
      euros = Double.parseDouble(System.console().readLine());
      
      double pesetas;
      pesetas = euros * 166.386;
      
      System.out.println(euros + "€ son " + (int)pesetas + " pesetas ");
    }
  }
