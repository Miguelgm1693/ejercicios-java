public class GatoSimple {
  String sexo;
  String nombre;

  public GatoSimple(String sexo, String nombre) {
    this.sexo = sexo;
    this.nombre = nombre;
  }

  public GatoSimple aparea(GatoSimple g){
    if (this.sexo == "macho" && g.sexo == "hembra") {
      System.out.println("Ha nacido Pepe.");
      return new GatoSimple ("macho", "Pepe");
    }
    if (this.sexo == "hembra" && g.sexo == "macho") {
      System.out.println("Ha nacido Pepe.");
      return new GatoSimple ("macho", "Pepe");
    } else {
      System.out.println("Gatos del mismo sexo no se pueden aparear");
      return null;
    }
  }
}
