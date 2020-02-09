/**
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer la respuesta) y
 * que, además, sea capaz de aprender nuevas capitales. En principio, el programa solo conoce
 * las capitales de España, Portugal y Francia. Estos datos deberán estar almacenados en un
 * diccionario. Los datos sobre capitales que vaya aprendiendo el programa se deben almacenar
 * en el mismo diccionario. El usuario sale del programa escribiendo la palabra "salir".
 */
package si06mgm1;

import java.util.HashMap;
import java.util.Scanner;

public class Si06mgm1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> capital = new HashMap<>();

    capital.put("Espana", "Madrid");
    capital.put("Portugal", "Lisboa");
    capital.put("Francia", "París");

    String pais;
    String cap;
    do {
      System.out.println("Escribe el nombre de un país y te diré su capital: ");
      pais = sc.nextLine();

      if (!capital.containsKey(pais)) {
        System.out.println("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
        cap = sc.nextLine();
        capital.put(pais, cap);
        System.out.println("¡Gracias por enseñarme nuevas capitales!");
      } else {
        System.out.println("La capital de " + pais + " es " + capital.get(pais));
      }

    } while (!pais.equals("salir"));
  }

}
