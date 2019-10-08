public class Ejercicio22 {
  public static void main(String [] args) {
    // 
      
    System.out.println("En este programa vamos a ver cuántos minutos faltan para llegar al fin de semana según el día de la semana y la hora.");
    System.out.println("Escribe un día de la semana (lunes - viernes): ");
    String dia = System.console().readLine();
    
    int numDia = 0;
    
    switch (dia) {
	  case "lunes":
	  numDia = 0;
	  break;
	  case "martes":
	  numDia = 1;
	  break;
	  case "miercoles":
	  numDia = 2;
	  break;
	  case "jueves":
	  numDia = 3;
	  break;
	  case "viernes":
	  numDia = 4;
	  break;
	  default:
	    System.out.println("El día introducido es erróneo (de lunes a viernes)");
	}
	
	System.out.println("Introduzca la hora y los minutos");
    System.out.print("Hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());
	
    int minutoSemana = (4 * 24 * 60) + (15 * 60);
    
    int minutoFinde = (numDia * 24 * 60) + (hora * 60) + minuto;
    
    System.out.println("¡Faltan " + (minutoSemana - minutoFinde) + " minutos para que llegue el fin de semana!");
    
 }   
}



