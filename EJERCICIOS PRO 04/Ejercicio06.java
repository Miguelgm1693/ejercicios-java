public class Ejercicio06 {
  public static void main(String [] args) {
    //calcular el tiempo que tarda un objeto en caer desde una altura h 
    //aplicando la formula t2 = 2h/g siendo g= 9.81 m/s2
      
    System.out.println("En este programa vamos a ver el tiempo que tarda en caer un objeto desde la altura que le indiquémos (m) ");
    
    double h;
    System.out.print("Dime desde que altura caerá el objeto en metros: ");
    h = Double.parseDouble(System.console().readLine());
    
    double seg;
    seg = Math.sqrt((2 * h) / 9.81);
          
    System.out.printf("El tiempo que tardará el objeto es de %.2f seg.", seg);
 }   
}

