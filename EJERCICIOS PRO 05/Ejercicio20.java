public class Ejercicio20 {
  public static void main(String[]args) {
    
    int altura = 0;
    System.out.print("Introduzca la altura de la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    String caracter;
    System.out.print("Introduzca el carácter con el que pintar la pirámide: ");
    caracter = System.console().readLine();
    
    int caracteresPorFila = 1;
    int espaciosDelante = altura;
    
    for (int i = 0; i < altura; i++) {
      
      //espacios delanteros en cada fila.
      for(int j = 0; j < espaciosDelante; j++) {
        System.out.print(" ");
      } 
      
      for (int j = 0; j < caracteresPorFila; j++) {  //esta línea pinta los caracteres de la fila
        System.out.print(caracter);
      }
       
      
    System.out.println();  
    caracteresPorFila += 2;
    espaciosDelante--;
    }
    
    
  }
}
