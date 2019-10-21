public class Ejercicio69 {
  public static void main(String[]args) {
    System.out.println("En este programa vamos a dibujar una pirámide hueca");
    
    int altura = 0;
    System.out.print("Introduzca la altura de la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    int caracteresPorFila = 1;
    int espaciosDelante = altura;
    
    for (int i = 0; i < altura; i++) {
      //pinta espacios delanteros
      for(int j = 0; j < espaciosDelante; j++) {
        System.out.print(" ");
      }  
      //pinta el flanco izquierdo
      for(int j = 0; j < caracteresPorFila; j++) {
        System.out.print("*");
      } 
      
      //pinta parte central
      if (i % 2 == 0) {  //cuando i es par
        System.out.print("****");
      } else {  
        System.out.print("    ");
      }
      //pinta el flanco derecho
      for (int j = 0; j < caracteresPorFila; j++) {  //esta línea pinta los caracteres de la fila
        System.out.print("*");
      }
          
    System.out.println(); 
     
    caracteresPorFila ++;
    espaciosDelante--;
    }
    
    
  }
}
