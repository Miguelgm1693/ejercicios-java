public class Ejercicio28 {
  public static void main(String[] args) {
  
    System.out.println("Este programa hace el juego de piedra, papel o tijera.");
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugador1 = (System.console().readLine()).toLowerCase();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String jugador2 = (System.console().readLine()).toLowerCase();
    
    if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
      
      System.out.print("\nGana el jugador 1");
    } else if (jugador1.equals("piedra") && jugador2.equals("papel")) {
      
      System.out.print("\nGana el jugador 2");
    } else if (jugador1.equals("tijera") && jugador2.equals("piedra")) {
      
      System.out.print("\nGana el jugador 2");
    } else if (jugador1.equals("tijera") && jugador2.equals("papel")) {
      
      System.out.print("\nGana el jugaor 1");
    } else if (jugador1.equals("papel") && jugador2.equals("piedra")) {
      
      System.out.print("\nGana el jugador 1");
    } else if (jugador1.equals("papel") && jugador2.equals("tijera")) {
      
      System.out.print("\nGana el jugador 2");
    } else if (jugador1.equals("piedra") && jugador2.equals("piedra")) {
      
      System.out.print("\nEmpate");
    } else if (jugador1.equals("papel") &&  jugador2.equals("papel")) {
      
      System.out.print("\nEmpate");
    } else if (jugador1.equals("tijera") && jugador2.equals("tijera")) {
      
      System.out.print("\nEmpate");
    } else {
      
      System.out.print("\nError, datos de entrada inesperados");
    }
  }
}
