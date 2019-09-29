public class Ejercicio03 {
  public static void main(String [] args) {
      
      double pesetas;
      System.out.print("Pon la cantidad de pesetas a convertir en € ");
      pesetas = Integer.parseInt(System.console().readLine());
      
      double euros;
      euros = pesetas / 166.386;
      
      System.out.println((int)pesetas + " pesetas son " + (double)euros + "€");
    }
  }
