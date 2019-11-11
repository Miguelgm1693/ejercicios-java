package tema7;

public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Programa  mostrará números enteros que serán su cuadrado y el cubo.");
    int [] num = new int [20];
    int [] cuadrado = new int [20];
    int [] cubo = new int [20];
    
    for (int i = 0; i < 20; i++) {
      num[i] = (int) ((Math.random()*100) + 1);
      
    }
    for (int i = 0; i < 20; i++) {
      cuadrado [i] = num[i] * num[i];
      
    }
    for (int i = 0; i < 20; i++) {
      cubo [i] = cuadrado[i] * num [i];
      
    }
    System.out.println("Num  ┃ cuadrado ┃   cubo");
    System.out.println("--------------------------");
    for (int i = 0; i < 20; i++) {
      System.out.printf( "%4d ┃ %8d ┃ %8d\n",num[i], cuadrado[i], cubo [i]);
    }
    
  }
}
