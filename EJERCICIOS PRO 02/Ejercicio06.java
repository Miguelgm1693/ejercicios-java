public class Ejercicio06 {
  public static void main(String [] args){
    
    double baseImponible = 23;
    double iva = baseImponible * 0.21;
    double total = baseImponible + iva;
    
  System.out.printf("Base Imponible  %10.2f€\n", baseImponible);
  System.out.printf("IVA             %10.2f€\n", iva);
  System.out.printf("───────────────────────────\n");
  System.out.printf("Total factura   %10.2f€\n", total);
    
 }
}

