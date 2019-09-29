public class Ejercicio10 {
  public static void main(String [] args) {
    
      System.out.println("Conversor de Mb a Kb");
      
      double mb;
      System.out.print("Introducir Mb a convertir: ");
      mb = Double.parseDouble(System.console().readLine());
      
      double kb;
      kb = mb * 1024;
            
      System.out.println( mb + "Mb equivale a " + kb + " Kb");
    }
  }
