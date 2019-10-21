public class Ejercicio20 {
  public static void main(String[]args) {
    System.out.println("En este programa vamos a dibujar una pirámide hueca");
    
    int alturaIntroducida;
    System.out.print("Introduzca la altura de la pirámide: ");
    alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    String caracter;
    System.out.print("Introduzca el carácter con el que pintar la pirámide: ");
    caracter = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espaciosDelante = alturaIntroducida - 1;
    int espaciosHuecos = 0;
    
    while (altura < alturaIntroducida) {
      //inserta espacios delante
      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      } 
      //pinta la linea
      System.out.print(caracter);
      for (i = 1; i < espaciosHuecos; i++) {
      System.out.print(" ");
      }
      if (altura > 1) {
      System.out.print(caracter);
      }
      
      System.out.println();
      altura++;
      espaciosDelante--;
      espaciosHuecos += 2;
    }
    
    // base piramide
    for (i = 1; i < altura  * 2; i++) {
      System.out.print(caracter);
    } 
    
  }
}
