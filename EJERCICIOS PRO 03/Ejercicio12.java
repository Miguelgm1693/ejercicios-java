public class Ejercicio12 {
  public static void main(String [] args) {
    //nota primer examen vale 40%
    //nota segundo examen vale 60%
    
      System.out.println("Nota del segundo exámen para sacar la media deseada en el trimestre");
      
      double nota1;
      System.out.print("Introduce la nota del primer examen: ");
      nota1 = Double.parseDouble(System.console().readLine());
      
      double notaTrimestre;
      System.out.print("Introduce la nota deseada para el trimestre: ");
      notaTrimestre = Double.parseDouble(System.console().readLine());
      
      double nota2;
      nota2 = ((notaTrimestre * 1) - (nota1 * 0.4)) / 0.6;
            
      System.out.println("Para tener una nota final de " + notaTrimestre + " necesitas en el segundo examen un " + nota2);
    }
  }
