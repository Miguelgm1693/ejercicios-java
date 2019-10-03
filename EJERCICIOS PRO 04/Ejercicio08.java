public class Ejercicio08 {
  public static void main(String [] args) {
    //calcular nota media de 3 notas
    System.out.println("Vamos a calcular la media de 3 notas");
    
    double ex1;
    System.out.print("Dime la nota del primer examen: ");
    ex1 = Double.parseDouble(System.console().readLine());
    
    double ex2;
    System.out.print("Dime la nota del segundo examen: ");
    ex2 = Double.parseDouble(System.console().readLine());
    
    double ex3;
    System.out.print("Dime la nota del tercer examen: ");
    ex3 = Double.parseDouble(System.console().readLine());
    
    double media;
    media = (ex1 + ex2 + ex3) / 3;
          
    System.out.printf("La media de los 3 examenes es de %.2f \n", media);
   
    if (media < 5) {
    System.out.println("La nota del boletín es Insuficiente");
    } 
     
    if ((media >= 5) && (media < 6 )) {
    System.out.println("La nota del boletín es Suficiente");
    } 
      
    if ((media >= 6) && (media < 7)) {
    System.out.println("La nota del boletín es Bien");
    } 
      
    if ((media >= 7) && (media < 9)) {
    System.out.println("La nota del boletín es Notable");
    } 
       
    if ((media >= 9) && (media <= 10)) {
    System.out.println("La nota del boletín es Sobresaliente");
    } 
    
 }   
}

