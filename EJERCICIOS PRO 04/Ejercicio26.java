public class Ejercicio26 {
  public static void main (String[]args) {
    
    System.out.println("En este programa vamos a calcular el precio de unas entradas de cine en función del número de personas y del día de la semana.");
    
    /* precio base 8€
     * miercoles precio dia espectador 5€
     * jueves precio dia pareja 11€ 2 entradas
     * 10% descuento con tarjeta
     */
    
    int entradasIndividual = numeroEntradas;
    double precioEntradaIndividual = 8;  
    double entradaPareja = 0;
    double descuento = 0;
    double total = 0;
    double pagar = 0;
    
    System.out.println("VENTA DE ENTRADAS CineCampa");
    
    System.out.print("Número de entradas: ");
    numeroEntradas = Integer.parseInt(System.console().readLine());
    
    String dia;
    System.out.print("Día de la semana: ");
    dia = System.console().readLine();
    
    String tarjeta;
    System.out.print("¿Tiene tarjeta cliente?(s/n): ");
    tarjeta = System.console().readLine();
    
    switch (dia) {
      case "miercoles":
        precioEntradaIndividual = 5;
      case "jueves":
        entradaPareja = numeroEntradas / 2;
        entradasIndividual = numeroEntradas % 2;  
      default:  
    }

    total = numeroEntradas * precioEntradaIndividual;
    total = total + (11 * entradaPareja);
    
    if (tarjeta.equals("s")) {
      descuento = total * 0.1;
    }
    
    pagar = total - descuento;
    
    System.out.println("Gracias por su compra");
    
    if (entradaPareja > 0) {
      System.out.printf("Entradas de pareja             %10.2d\n", entradaPareja);
      System.out.printf("Precio entrada por pareja      %10.2f€\n", 11.00);
    }
    
    if (numeroEntradas > 0) {
      System.out.printf("Entradas individuales          %10.2d\n", numeroEntradas);
      System.out.printf("precio por entrada individual  %10.2f\n", precioEntradaIndividual);
    }

    System.out.printf("Precio total entradas            %10.2f\n", total);
    System.out.printf("descuento                        %10.2f\n", descuento);
    System.out.printf("Precio a pagar                   %10.2f\n", pagar);
    


    
    
    
    
  }
}
