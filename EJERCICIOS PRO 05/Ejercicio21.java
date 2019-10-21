public class Ejercicio21 {
  public static void main(String[]args) {
  
    System.out.println("En este programa vamos a introducir unos números, nos dirá cuántos números hemos introducido, la media de los impares y el mayor de los pares");
  
    int numeroIntroducido = 0;
    int contador = 0;
    int sumaImpar = 0;
    int contadorImpar = 0;
    int mayorPar = 0;
    
    while (numeroIntroducido >= 0) {
      System.out.print("Introduzca un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      contador ++;
      
      if ((numeroIntroducido % 2 == 0) && (numeroIntroducido > mayorPar)) {
      mayorPar = numeroIntroducido;          
      }
      
      if ((numeroIntroducido % 2 != 0) && (numeroIntroducido >= 0)) {
        contadorImpar++;
        sumaImpar += numeroIntroducido;
        
      }      
    }
    
    System.out.println("Has introducido " + (contador - 1) + " números.");
    System.out.println("La media de los números impares es " + (sumaImpar  / contadorImpar ));
    System.out.println("El mayor de los números pares es " + mayorPar);
    
  }  
}
