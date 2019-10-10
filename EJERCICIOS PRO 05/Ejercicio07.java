public class Ejercicio07 {
  public static void main(String[]args) {
    
    System.out.println("En este programa nos da acceso a una caja fuerte");
    
    int codigo = 1234;
    int intentos = 4;
    int opcion = 0;
    
    do {
	System.out.print("Introduzca el código de la caja fuerte: ");
	opcion = Integer.parseInt(System.console().readLine());
	intentos --;		
	} while (intentos > 0 && codigo != opcion);  
    
    if (opcion == codigo) {
	  System.out.print("La caja  ");
	}    
  }
}
