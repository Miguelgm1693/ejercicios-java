public class Ejercicio27 {
  public static void main(String[] args) {
    
    System.out.println("Programa que nos hace presupuestos para tartas.");
    
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = (System.console().readLine()).toLowerCase();
    if (sabor.equals("chocolate")) {
      
      System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
      sabor = (System.console().readLine()).toLowerCase();
    }
    System.out.print("¿Quiere nata? (si o no): ");
    String nata = (System.console().readLine()).toLowerCase();
    
    System.out.print("¿Quieres ponerle un nombre? (si o no): ");
    String nombre = (System.console().readLine()).toLowerCase();
    
    System.out.println("");
    
    double precio = 0;
    switch (sabor) {
      
      case "manzana":
        
        precio = 18;
        System.out.printf("Tarta de manzana: %10.2f €", precio);
        break;
      case "fresa":
      
        precio = 16;
        System.out.printf("Tarta de fresa: %10.2f €", precio);
        break;
      case "negro":
        
        precio = 14;
        System.out.printf("Tarta de chocolate negro: %10.2f €", precio);
        break;
      case "blanco":
      
        precio = 15;
        System.out.printf("Tarta de chocolate blanco: %10.2f €", precio);
        break;
    }
    if (nata.equals("si") || nata.equals("sí")) {
      
      System.out.print("\nCon nata:               2.50 €");
      precio += 2.5;
    }
    if (nombre.equals("si") || nombre.equals("sí")) {
      
      System.out.print("\nCon nombre:             2.75 €");
      precio += 2.75;
    }
    
    System.out.printf("\nTotal:             %10.2f€", precio);
  }
}
