package ejercicio10;

class Ameba {

  private int peso;

  public Ameba() {
    this.peso = 3;
  }

  public void come(int peso) {
    this.peso += peso - 1;
  }

  public void come(Ameba ameba) {
    this.peso += ameba.peso - 1;
    ameba.peso = 0;
  }

  @Override
  public String toString() {
    return "Soy una Ameba y peso " + peso + " microgramos.";
  }

}
