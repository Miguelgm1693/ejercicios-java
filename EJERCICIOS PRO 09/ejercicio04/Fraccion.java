
package ejercicio04;

/**
 * @author gonza
 */
public class Fraccion {
  //Variables
  
  int numerador;
  int denominador;
  
  //Constructor

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  //Métodos
  
  public Fraccion invierte () {
    return new Fraccion(this.denominador, this.numerador);
  }
  
  public Fraccion simplifica(int n) {
    int numeradorAux = this.numerador;
    int denominadorAux = this.denominador;
    
    while ((numeradorAux % n == 0) && (denominadorAux % n == 0)) {
      numerador = numerador / n;
      denominador = denominador / n;
    }
    
    return new Fraccion (numeradorAux, denominadorAux);
  }
  
  public Fraccion simplifica () {
    Fraccion aux = this;
    for (int i = 2; i <= Math.min(aux.numerador , aux.denominador); i++) {
      aux.numerador = aux.numerador / i;
      aux.denominador = aux.denominador / i;
    }
    
    return aux;
  }
  
  
  
  
  public Fraccion multiplica (int n) {
    return new Fraccion(this.numerador * n , this.denominador);
  }
  
  public Fraccion multiplica (Fraccion f) {
    return new Fraccion(this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }
  
  public Fraccion dividir (int n) {
    return new Fraccion (this.numerador , this.denominador * n );
  }
  
  public Fraccion dividir (Fraccion f) {
    return new Fraccion (this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
  }

  @Override
  public String toString() {
    return "Fraccion 1: " + numerador + "/" + denominador;
  }
  
  

  public int getNumerador() {
    return numerador;
  }

  public int getDenominador() {
    return denominador;
  }
  
  
  
}
