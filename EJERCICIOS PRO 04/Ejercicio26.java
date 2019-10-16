import java.util.Scanner;

public class Ejercicio26 {
 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Venta de entradas CineCampa");
    System.out.print("Número de entradas: ");
    int numeroDeEntradas = Integer.parseInt(s.nextLine());
    
    System.out.print("Día de la semana: ");
    String diaSemana = s.nextLine();
    
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    boolean tieneTarjeta = (s.nextLine()).equalsIgnoreCase("s");
    
    double precioBase = 8;
    
    if (diaSemana.equalsIgnoreCase("miercoles") || diaSemana.equalsIgnoreCase("miércoles")){
      precioBase = 5;
    }
    
    int entradasPareja = 0;
    int entradasIndividuales = numeroDeEntradas; 
    double total = 0;
    
    if (diaSemana.equalsIgnoreCase("jueves")) {
      entradasPareja = numeroDeEntradas / 2;
      entradasIndividuales = numeroDeEntradas % 2;  //aqui lo que hacemos es sacar el resto para saber quien se queda fuera de la pareja por ejemplo si son 11 hay 5 parejas y 1 solo.
    } 
    
    System.out.println("Aquí tiene sus entradas, muchas gracias");
    if (entradasPareja > 0) {
      System.out.printf("Entradas pareja          %4d\n", entradasPareja);
      System.out.printf("Precio unitario         %4.2f €\n", 11.00);
      total += entradasPareja * 11;
    }
    
    if (entradasIndividuales > 0) {
      System.out.printf("Entradas individuales    %4d\n", entradasIndividuales);
      System.out.printf("Precio unitario          %4.2f €\n", precioBase);
      total += entradasIndividuales * precioBase;
    }
           
    System.out.printf("Total                   %4.2f €\n", total);
    
    double descuento = 0;
    if (tieneTarjeta) {
      descuento = total * 0.1;
    }
    
    System.out.printf("Descuento                %4.2f €\n", descuento);
    System.out.printf("Total a pagar           %4.2f €\n", total - descuento);
  }
  
}
