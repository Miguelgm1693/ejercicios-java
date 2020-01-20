
package ejercicio05;

/**
 * @author Miguel
 */
public class Pizza {

    private final String tipo;
    private final String tamaño;
    private String estadoPizza;
    private static int TotalServidas;
    private static int TotalPedidas;

//Constructor
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        estadoPizza = "pedida";
        TotalPedidas++;
    }

    public void sirve() {
        if ("servida".equals(this.estadoPizza)) {
            System.out.println("Esta pizza ya está servida.");
        } else {
            this.estadoPizza = "servida";
            TotalServidas++;
        }
    }

// Getters
    public static int getTotalServidas() {
        return TotalServidas;
    }

    public static int getTotalPedidas() {
        return TotalPedidas;
    }

// toStrings
    @Override
    public String toString() {
        return "Pizza: " + tipo + ", " + tamaño + ". Estado de la Pizza: " + estadoPizza;
    }   
    
}
