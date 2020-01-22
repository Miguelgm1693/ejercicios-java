/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

import java.text.DecimalFormat;

/**
 * @author gonza
 */
public class Movil extends Terminal {

  private final String tarifa;
  private double totalCoste;

  //Constructor
  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.totalCoste = 0;
  }

  public void llama(Movil m, int tiempo) {
    super.llama(m, tiempo);

    if (tarifa.equals("rata")) {
      this.totalCoste += 0.1 * tiempo / 100;
    }

    if (tarifa.equals("mono")) {
      this.totalCoste += 0.2 * tiempo / 100;
    }

    if (tarifa.equals("bisonte")) {
      this.totalCoste += 0.5 * tiempo / 100;
    }

  }

  @Override
  public String toString() {
    
    DecimalFormat f = new DecimalFormat("0.00");
    
    return super.toString() + " - tarificados " + f.format(totalCoste) + " euros";
    
  }

}
