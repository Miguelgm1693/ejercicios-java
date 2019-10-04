public class Ejercicio11 {
  public static void main(String[]args) {
 
   System.out.println("Este programa te dirá cuantos segundos quedan para llegar a media noche");
      
   int hora;
   System.out.println("Introduzca la hora del día");
   hora = Integer.parseInt(System.console().readLine());
  
   
   int minuto;
   System.out.println("Introduzca los minutos");
   minuto = Integer.parseInt(System.console().readLine());
   
   
   int segundosHoraMinuto = (hora * 3600) + (minuto * 60);
   int segundosMediaNoche = (24 * 3600) - (segundosHoraMinuto);
   
   if (segundosMediaNoche > 0) {
      System.out.printf("A la hora %2d:%2d faltan %2d segundos para media noche", hora, minuto, segundosMediaNoche);
     } else if (segundosMediaNoche < 0) {
      System.out.println("La hora o minutos introducidos no son correctos"); 
     }
   
 }
}
  // Preguntar como se puede poner en los minutos 01,09,08 a la hora de representar en un print.
