
package ejercicio04;

/**
 *
 * @author gonza
 */
public class MainFraccion {

  public static void main(String[] args) {
    Fraccion fraccion1 = new Fraccion(40, 60);
    System.out.println(fraccion1);
    fraccion1.invierte();
    System.out.println(fraccion1);
    System.out.println(fraccion1.multiplica(5));
    Fraccion fAux = new Fraccion (5,10);
    System.out.println(fraccion1.multiplica(fAux));
    System.out.println(fraccion1.dividir(fAux));
    System.out.println(fraccion1.simplifica());
  }

}

