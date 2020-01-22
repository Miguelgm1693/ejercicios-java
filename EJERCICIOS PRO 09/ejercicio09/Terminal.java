/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

/**
 *
 * @author gonza
 */
public class Terminal {
  private final String numeroT;
  private int tiempoC;

  public Terminal(String numeroT) {
    this.numeroT = numeroT;
    this.tiempoC = 0;
  }

  public void llama(Terminal t, int tiempo) {
    this.tiempoC += tiempo;
    t.tiempoC += tiempo;
  }

  @Override
  public String toString() {
    return "Nº " + numeroT + " - " + tiempoC + "s de conversación.";
  }

  public int getTiempoC() {
    return tiempoC;
  }

  public void setTiempoC(int tiempoC) {
    this.tiempoC = tiempoC;
  }
  
  

}

