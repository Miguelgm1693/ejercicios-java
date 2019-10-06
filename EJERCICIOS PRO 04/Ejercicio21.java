public class Ejercicio21 {
  public static void main(String [] args) {
    // 
      
    System.out.println("En este programa vamos a calcular la nota media de un alumno en programación");
    System.out.println("Dime la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Dime la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2;  
    
    String apto;
  
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación (apto/no apto)?");
      apto = System.console().readLine();
      if (apto.equals("apto")) {
        media = 5;
        }
      }
      
    System.out.print("Tu nota media en Programación es de " + media);  

 }   
}

