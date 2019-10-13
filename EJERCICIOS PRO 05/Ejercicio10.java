public class Ejercicio10 {
  public static void main (String[]args) {
	  
	  System.out.println("En este programa vamos a calcular la media de un conjunto de números positivos introducidor por teclado.");
	  
	  double numeroPos = 0;
	  double suma = 0;
	  double numerosIntro = 0;
	  
	  do {
		System.out.println("Introduzca un número positivo (introduce uno negativo para cerrar programa");  
		numeroPos = Double.parseDouble(System.console().readLine());
		numerosIntro++;
		suma += numeroPos;
	  } while (numeroPos >= 0);
	  
	  System.out.println("La media de los números introducidos es " + (suma - numeroPos) / (numerosIntro -1)); 
	  
 }
}
