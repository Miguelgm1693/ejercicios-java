public class Ejercicio09 {
  public static void main(String [] args) {
    
      System.out.println("Calculemos el volumen de un cono");
      
      double radio;
      System.out.print("¿Cuál es el radio del cono? ");
      radio = Double.parseDouble(System.console().readLine());
      
      double altura;
      System.out.print("¿Y la altura del cono? ");
      altura = Double.parseDouble(System.console().readLine());
      
      double pi;
      pi = 3.1415;
      
      double volumen;
      volumen = (pi * radio * radio * altura) / 3;
      
      System.out.println("El volumen del cono es " + volumen + " cm³");
    }
  }
  
  
