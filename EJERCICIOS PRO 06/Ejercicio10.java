package tema6;

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("En este programa vamos a pintar 10 líneas de caracteres aleatorios.");
    int caracteres;
    int total;
    String caracteres2 = "";
    
    for (int i = 1; i <= 10; i++) {
      
      total = (int)(Math.random() * 40) + 1;
      caracteres = (int)(Math.random() * 6) + 1;
      
      switch(caracteres) {
        case 1:
          caracteres2 = "*";
          break;
        case 2:  
          caracteres2 = "-";
        case 3:  
          break;
        case 4:  
          caracteres2 = "=";
          break;
        case 5: 
          caracteres2 = ".";
          break;
        case 6: 
          caracteres2 = "|";
          break;
        case 7:
          caracteres2 = "@";
        break;  
      }
      
      for (int j = 1; j <= total; j++) {
        System.out.print(caracteres2);  
      }
      
      System.out.println();   
    }
             
  }
}
