public class Ejercicio16 {
  public static void main(String[]args) {

    System.out.println("En este programa vamos a introducir un número y dicho programa nos dirá si ese número es primo");

    int numero;
    System.out.println("Introduzca el número: ");
    numero = Integer.parseInt(System.console().readLine()); 

    boolean primo = true;

    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) { 
      primo = false;
      }   
    }
    
    if (primo) {
      System.out.println("El número introducido es primo");	
    } else {
      System.out.println("El número introducido no es primo");
    }

  }
}
