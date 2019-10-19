public class Ejercicio18 {
  public static void main(String[]args) {
  
    System.out.println("En este programa vamos a ver introducir dos números y el programa nos va a decir los números comprendidos entre dicho programa de 7 en 7");
    
    int numeroUno = 0;
    System.out.print("Introduzca el primer número: ");
    numeroUno = Integer.parseInt(System.console().readLine());
    
    int numeroDos = 0;
    System.out.print("Introduzca el segundo número (distinto al anterior): ");
    numeroDos = Integer.parseInt(System.console().readLine());
    
    if (numeroUno == numeroDos) {
      System.out.println("Los números introducidos no pueden ser iguales");
    }
    
    for (int i = numeroUno ; i < numeroDos ; i = i + 7) {
      System.out.print(i + ", ");
    } 
    
  }
}
