package tema6;

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Prograa que generará 20 notas al azar.");
    
    int nota;
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for (int i = 1; i <= 20; i++) {
      nota = (int) (Math.random() * 6);
      
      switch (nota) {
        case 1:
          System.out.println("Suspenso");
          suspenso++;
          break;
        case 2:
          System.out.println("Suficiente");
          suficiente++;
          break;
        case 3:
          System.out.println("Bien");
          bien++;
          break;
        case 4:
          System.out.println("Notable");
          notable++;
          break;
        case 5:
          System.out.println("Sobresaliente");
          sobresaliente++;
          break;
        default:  
      }   
    }
    
    System.out.println("\nEl nº de suspensos es: " + suspenso);
    System.out.println("El nº de suficientes es: " + suficiente);
    System.out.println("El nº de bien es: " + bien);
    System.out.println("El nº de notables es: " + notable);
    System.out.println("El nº de sobresalientes es: " + sobresaliente);
  }
}
