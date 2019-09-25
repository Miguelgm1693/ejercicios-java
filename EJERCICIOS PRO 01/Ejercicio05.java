public class Ejercicio05{
  public static void main(String[]args){

    final String rojo = "\033[31m";
    final String verde = "\033[32m";
    final String naranja = "\033[33m";
    final String azul = "\033[34m";
    final String morado = "\033[35m";
    final String celeste = "\033[36m";
    final String blanco = "\033[37m";

   System.out.println(blanco + "┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
   System.out.println(blanco + "┃  L \t  M \t  X \t  J \t  V   ┃");
   System.out.println(blanco + "┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
   System.out.println(blanco + "┃" + rojo + " PRO" + naranja + "\t EDD" + rojo + "\t PRO\t PRO" + morado + "\t SINF" + blanco + " ┃");
   System.out.println(blanco + "┃" + rojo + " PRO" + celeste + "\t LM" + rojo + "\t PRO\t PRO" + morado + "\t SINF" + blanco + " ┃");
   System.out.println(blanco + "┃" + rojo + " PRO" + celeste + "\t LM" + rojo + "\t PRO" + verde + "\t EDD" + morado + "\t SINF" + blanco + " ┃");
   System.out.println(blanco + "┃" + azul + " BBDD" + morado + "\t SINF" + azul + "\t BBDD" + verde + "\t EDD" + blanco + "\t FOL" + blanco + "  ┃");
   System.out.println(blanco + "┃" + azul + " BBDD" + morado + "\t SINF" + azul + "\t BBDD" + celeste + "\t LM" + blanco + "\t FOL" + blanco + "  ┃");
   System.out.println(blanco + "┃" + azul + " BBDD" + morado + "\t SINF" + azul + "\t BBDD" + celeste + "\t LM" + blanco + "\t FOL" + blanco + "  ┃");
   System.out.println(blanco + "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
 }
}



