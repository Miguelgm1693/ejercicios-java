public class Ejercicio03 {
  public static void main(String [] args) {
    // Vamos a escribir un número del 1 al 7 y el programa nos dirá el día de la semana.
        
      System.out.println("¿Quieres saber que día de la semana es con solo decirme un número?");
      System.out.println("Pues dime un número del 1 al 7 y te lo diré: ");
      
       String dia = (System.console().readLine());
              
       if ("1".equalsIgnoreCase(dia)) {
         System.out.println("Lunes");
       } 
       
       else if ("2".equalsIgnoreCase(dia)) {
         System.out.println("Martes");
       }
                  
       else if ("3".equalsIgnoreCase(dia)) {
         System.out.println("Miercoles");
       }
                   
       else if ("4".equalsIgnoreCase(dia)) {
         System.out.println("Jueves");
       }
                     
       else if ("5".equalsIgnoreCase(dia)) {
         System.out.println("Viernes");
       }
                     
       else if ("6".equalsIgnoreCase(dia)) {
         System.out.println("Sabado");
       }
              
       else if ("7".equalsIgnoreCase(dia)) {
         System.out.println("Domingo");
       } else {
         System.out.println("Introduzca un número del 1 al 7 y no otra cosa ¬¬");
       }
    }
  }
