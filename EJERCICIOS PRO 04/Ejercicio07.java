public class Ejercicio07 {
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
          
   System.out.printf("La media de los 3 examenes es de %.2f", media);
 }   
}

