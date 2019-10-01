public class Ejercicio02 {
  public static void main(String [] args) {
    //Introducir hora del día y que nos dé los buenos días, noches o tardes.
    //Vamos a entender que && es como si leyeramos "y" y si ponemos || como si leyeramos "o"
        
       System.out.println("¿Qué hora del día es? "); 
      
       int hora = Integer.parseInt(System.console().readLine());       
       if ((hora >= 6) && (hora <= 12)) {
         System.out.println("¡Buenos días!");
       } 
       
       if ((hora >= 13) && (hora <= 20 )) {
         System.out.println("¡Buenos tardes!");
       } 
       
       if ((hora >= 21) && (hora <= 23)) {
         System.out.println("¡Buenas Noches!");
       } 
       
       if ((hora >= 0) && (hora <= 5)) {
         System.out.println("¡Buenas Noches!");
       } 
       
       if ((hora >= 24) || (hora < 0)) {
         System.out.println("La hora introducida no es correcta");
       } 
 }      
}       
