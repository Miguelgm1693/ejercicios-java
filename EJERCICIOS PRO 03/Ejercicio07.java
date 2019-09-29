public class Ejercicio07 {
  public static void main(String [] args) {
      
      double baseImponible;
      System.out.print("Dime la base imponible de tu factura ");
      baseImponible = Double.parseDouble(System.console().readLine());
      
      double iva;
      iva = baseImponible * 0.21;
      
      double total;
      total = baseImponible + iva;
      
      System.out.printf("Base Imponible  %10.2f€\n", baseImponible);
      System.out.printf("IVA             %10.2f€\n", iva);
      System.out.printf("───────────────────────────\n");
      System.out.printf("Total factura   %10.2f€\n", total);
    }
  }
