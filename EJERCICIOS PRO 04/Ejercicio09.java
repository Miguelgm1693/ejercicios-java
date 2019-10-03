public class Ejercicio09 {
  public static void main(String [] args) {
    // Resolver la ecuación ax² + bx + c = 0
      
    System.out.println("En este programa vamos a resolver la ecuación ax² + bx + c = 0 ");
    
    double a;
    System.out.print("Dime el valor de a: ");
    a = Double.parseDouble(System.console().readLine());
    
    double b;
    System.out.print("Dime el valor de b: ");
    b = Double.parseDouble(System.console().readLine());
    
    double c;
    System.out.print("Dime el valor de c: ");
    c = Double.parseDouble(System.console().readLine());
    
    double r;
    r = (b * b) - (4 * a * c);
    
    if (r < 0) {
      System.out.println("La ecuación no tiene solución real");
    } else {
      System.out.println("X1 = " + (-b + Math.sqrt(r)) / (2 * a));
      System.out.println("X2 = " + (-b - Math.sqrt(r)) / (2 * a));
    }
    
    if (a == 0) && (b == 0) && (c != 0) {
      System.out.println("La ecuación no tiene solución");
    } else if (a == 0) && (b == 0) && (c == 0) 
      System.out.println("Infinitas soluciones");
    } else if (a == 0) && (b != 0) && (c != 0) {
      System.out.println("Una única solución x = ");
    }
    
        
 }   
}

