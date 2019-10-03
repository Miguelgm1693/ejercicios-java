public class Ejercicio01 {
  public static void main(String [] args) {
    //Programa en el que al escribir el día de la semana nos diga la asignatura que tenemos a 1º hora
        
      System.out.println("¿Quieres saber que tienes a primera cualquier día de la semana?");
      System.out.println("Dime el día de la semana que quieres que te diga: ");
      
       String dia = (System.console().readLine());       
       if ("lunes".equalsIgnoreCase(dia)) {
         System.out.println("El lunes a primera tienes PRO");
       } 
       
         else if ("martes".equalsIgnoreCase(dia)) {
         System.out.println("El martes a primera hora tienes EED");
       }
                  
         else if ("miercoles".equalsIgnoreCase(dia)) {
         System.out.println("El Miércoles a primera tienes PRO");
       }
                   
         else if ("jueves".equalsIgnoreCase(dia)) {
         System.out.println("El jueves a primera tienes PRO");
       }
                     
         else if ("viernes".equalsIgnoreCase(dia)) {
         System.out.println("El viernes a primera tienes SI");
       }
                     
         else if ("sabado".equalsIgnoreCase(dia)) {
         System.out.println("¡A dormir se ha dicho!");
       }
              
         else if ("domingo".equalsIgnoreCase(dia)) {
         System.out.println("Los domingos son para descansar");
       } else {
         System.out.println("Introduzca la palabra correcta");
       }
    }
  }
