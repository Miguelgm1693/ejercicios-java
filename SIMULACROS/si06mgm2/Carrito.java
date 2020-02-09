
package si06mgm2;

import java.util.ArrayList;

public class Carrito {
  ArrayList<Elemento> element = new ArrayList <>();

  public void agrega(Elemento e) {
    element.add(e);
  }

  public int numeroDeElementos() {
    return element.size();
  }

  public double importeTotal() {
    double total = 0; 
    for (Elemento e : element) {
      total += e.getPrecio() * e.getCantidad();
    }
    return total;
    
  }

  @Override
  public String toString() {
    String texto = "Contenido del carrito\n";
    texto += "=======================\n";
    for (Elemento elemento : element) {
      texto += elemento.toString();      
    }
    return texto;
  }
  
  
  
  
  
  
  
  
  
  
}
