public class Ejercicio04 {
  public static void main(String [] args) {
      //Calcular el salario semanal de un trabajador que gana 12€ la hora si trabaja 40horas 
      // a partir de la hora 41 se paga a 16€ la hora
      
      System.out.print("Introducir las horas trabajadas durante la semana y te diré el salario semanal: ");
      double horasTrabaja = Double.parseDouble(System.console().readLine());
      
      double sueldoSemana;
      
      if (horasTrabaja <= 40) {
          sueldoSemana = 12 * horasTrabaja;
        } else {
          sueldoSemana = (12 * 40) + ((horasTrabaja - 40) * 16);
        }
           
            
      System.out.println("El sueldo ganado durante la semana es de " + sueldoSemana + "€");
    }
  }
