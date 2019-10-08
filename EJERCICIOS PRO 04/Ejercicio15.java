public class Ejercicio15 {
  public static void main(String [] args) {
    // Decir mes y día de nacimiento y que el programa nos lo resuelva con nuestro horóscopo.
      
    System.out.println("En este programa vamos a dibujar una pirámide con lo que pongamos en teclado");
    System.out.println("Introduzca en el teclado lo que quieras que se haga pirámide (relleno): ");
    String pira;
    pira = System.console().readLine(); 
    
    System.out.println("Elija el número hacia donde quiera que vaya la pirámide (1-4): ");
    System.out.println("1 - Dirección hacia arriba ");
    System.out.println("2 - Diracción hacia la derecha ");
    System.out.println("3 - Dirección hacia abajo ");
    System.out.println("4 - Dirección hacia la izquierda ");
    System.out.print("Introduzca una opción: ");
    int direccion = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
   
    
    switch(direccion) {
      case 1:
        System.out.println("    " + pira + pira + "    ");
        System.out.println("   " + pira + pira + pira + pira + "   ");
        System.out.println("  " + pira + pira + pira + pira + pira + pira + "  ");
        System.out.println(" " + pira + pira + pira + pira + pira + pira + pira + pira +" ");
        System.out.println(pira + pira + pira + pira + pira + pira + pira + pira + pira + pira);
        
        break;
      case 2:
        System.out.println(pira);
        System.out.println(pira + " " + pira);
        System.out.println(pira + " " + pira + " " + pira);
        System.out.println(pira + " " + pira);
        System.out.println(pira); 
        
        break;
      case 3:
        System.out.println(pira + pira + pira + pira + pira + pira + pira + pira + pira + pira);
        System.out.println(" " + pira + pira + pira + pira + pira + pira + pira + pira +" ");
        System.out.println("  " + pira + pira + pira + pira + pira + pira + "  ");
        System.out.println("   " + pira + pira + pira + pira + "   ");
        System.out.println("    " + pira + pira + "    ");
        break;
      case 4:
        System.out.println("    " + pira);
        System.out.println("  " + pira + " " + pira);
        System.out.println(pira + " " + pira + " " + pira);
        System.out.println("  " + pira + " " + pira);
        System.out.println("    " + pira); 
      default:
      System.out.println("No ha seleccionado una de las opciones (1-4)");
    }
    

 }   
}

