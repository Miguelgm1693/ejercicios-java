/**
 * Una empresa de venta por internet de productos electrónicos nos ha encargado implementar
 * un carrito de la compra. Crea la clase Carrito. Al carrito se le pueden ir agregando elementos
 * que se guardarán en una lista, por tanto, deberás crear la clase Elemento. Cada elemento
 * del carrito deberá contener el nombre del producto, su precio y la cantidad (número de
 * unidades de dicho producto). A continuación se muestra tanto el contenido del programa
 * principal como la salida que debe mostrar el programa. Los métodos a implementar se
 * pueden deducir del main.
 */
package si06mgm2;

public class Si06mgm2 {

  public static void main(String[] args) {
    Carrito miCarrito = new Carrito();
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
    miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));
    System.out.println(miCarrito);
    System.out.print("Hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + miCarrito.importeTotal() + " euros");
    System.out.println("\nContinúa la compra...\n");
    miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
    System.out.println(miCarrito);
    System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + miCarrito.importeTotal() + " euros");
  }

}
