public class Ejercicio08 {
  public static void main(String[]args) {
    
    System.out.println("En este programa introduciremos un número por teclado y nos hará la tabla de multiplicar con dicho número");
    
    int num;
    System.out.println("Introduzca el número que quiera que se haga la tabla de multiplicar: ");
    num = Integer.parseInt(System.console().readLine());
    
    for (int tm = 0; tm < 11; tm++) {
	  System.out.println(num + " x " + tm + "  = " + (num * tm));	
	}
		  
  }
}
