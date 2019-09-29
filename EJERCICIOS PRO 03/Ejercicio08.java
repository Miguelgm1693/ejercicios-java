public class Ejercicio08 {
  public static void main(String [] args) {
      
      double horas;
      System.out.print("¿Cuántas horas ha trabajado el empleado esta semana? ");
      horas = Double.parseDouble(System.console().readLine());
      
      double total;
      total = horas * 12;
      
      double hs;
      hs = 12;
      
      System.out.printf("Horas trabajadas%10.2f€\n", horas);
      System.out.printf("€ hora          %10.2fh\n", hs);
      System.out.printf("───────────────────────────\n");
      System.out.printf("Total ganado    %10.2f€\n", total);
    }
  }
  
  
