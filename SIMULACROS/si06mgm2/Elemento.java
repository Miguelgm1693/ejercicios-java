
package si06mgm2;

public class Elemento {
  String aparato;
  double precio;
  int cantidad;

  public Elemento(String aparato, double precio, int cantidad) {
    this.aparato = aparato;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public String getAparato() {
    return aparato;
  }

  public void setAparato(String aparato) {
    this.aparato = aparato;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return this.aparato + " PVP: " + this.precio + " Unidades: " + this.cantidad
            + " Subtotal: " + this.precio * this.cantidad + "\n";
  }
  
  
  
  
  
}
