public class Ejercicio24 {
  public static void main(String [] args) {
    // 
      
    System.out.println("En este programa vamos a generar la nómina de un empleado cualquiera");
    
    int empleado;
    System.out.println("Introduzca el cargo del empleado (1-3)");
    System.out.println("1. Programador Junior. ");
    System.out.println("2. Programador Senior. ");
    System.out.println("3. Jefe de Proyecto. ");
    empleado = Integer.parseInt(System.console().readLine());
    
    int viaje;
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    viaje = Integer.parseInt(System.console().readLine());
    
    int estadoCivil;
    System.out.println("Estado civil del empleado:");
    System.out.println("1. Soltero.");
    System.out.println("2. Casado.");
    estadoCivil = Integer.parseInt(System.console().readLine());
    
    double sueldoBase = 0;
        
    switch (empleado) {
	  case 1:
	  sueldoBase = 950;
	  break;
	  case 2:
	  sueldoBase = 1200;
	  break;
	  case 3:
	  sueldoBase = 1600;
	  break;
	  default:
	    System.out.println("El empleado introducido es erróneo.");
	}
	
	double dietas = (viaje * 30);
	double sueldoBruto = (sueldoBase + dietas);
	
	double estado = 0;
		
	switch (estadoCivil) {
	  case 1:
	  estado = (sueldoBruto * 0.25); 
	  break;
	  case 2:
	  estado = (sueldoBruto * 0.20);
	  break;
	  default:
	    System.out.println("El estado civil introducido es erróneo.");
	}
	
	double sueldoNeto = (sueldoBruto - estado);
    
    System.out.printf("Sueldo Base          %10.2f€\n", sueldoBase);
    System.out.printf("Dietas (%d días)     %10.2f€\n", viaje, dietas);
    System.out.printf("----------------------------------\n");
    System.out.printf("Sueldo Bruto         %10.2f€\n", sueldoBruto);
    System.out.printf("Retención de IRPF    %10.2f \n", estado);
    System.out.printf("----------------------------------\n");
    System.out.printf("Sueldo neto          %10.2f€\n", sueldoNeto);
    
 }   
}



