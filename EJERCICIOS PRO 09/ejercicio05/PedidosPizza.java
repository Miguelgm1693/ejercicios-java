
package ejercicio05;

/* @author Miguel

*/
public class PedidosPizza {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Margarita", "Mediana");
        Pizza p2 = new Pizza("Funghi", "Familiar");
        p2.sirve();
        Pizza p3 = new Pizza("Cuatro Quesos", "Mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}
