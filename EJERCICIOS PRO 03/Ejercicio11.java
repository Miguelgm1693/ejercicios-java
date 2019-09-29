public class Ejercicio11 {
  public static void main(String [] args) {
    
      System.out.println("Conversor de Kb a Mb");
      
      double kb;
      System.out.print("Introducir Mb a convertir: ");
      kb = Double.parseDouble(System.console().readLine());
      
      double mb;
      mb = kb / 1024;
            
      System.out.println( kb + "Kb equivale a " + mb + " Mb");
    }
  }
