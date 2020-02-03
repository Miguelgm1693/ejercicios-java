/**
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados en
 * una estructura de la clase HashMap.
 */
package ejercicio06;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    String nombreUsuario;
    int contrasena;
    int intentos = 3;
    boolean tieneAcceso = false;
    


    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> usuario = new HashMap<>();

    usuario.put("Miguelgm", 1693);
    usuario.put("PepeLuis", 2014);

    do {     
      System.out.println("Introduzca el nombre de Usuario:");
      nombreUsuario = sc.nextLine();

      System.out.println("Contraseña");
      contrasena = Integer.parseInt(sc.nextLine());

      if (usuario.containsKey(nombreUsuario)) {
        System.out.println("Acceso admitido");
        System.out.println("Ha accedido al área restringida");
        tieneAcceso = true;

      } else {
        System.out.println("El usuario o contraseña no son correctos, Inténtelo de nuevo (3 intentos)");
      }

      intentos--;

      if (intentos > 0 && tieneAcceso == false) {
        System.out.println("Le quedan " + intentos + " intentos");
      }

    } while (intentos > 0 && tieneAcceso == false);

    if (intentos == 0) {
      System.out.println("No ha podido acceder al área restringida");
    }

  }

}
