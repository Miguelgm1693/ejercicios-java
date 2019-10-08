public class Ejercicio25 {
    public static void main(String[]args) {
		
	System.out.println("En este programa vamos hacer un calculador de precios para BanderaDeEspaña.es");
	System.out.println("A continuación introduciremos los datos de la bandera que deseamos.");
	
	double altura;
	System.out.println("Introduzca altura de la bandera en cm: ");	
	altura = Double.parseDouble(System.console().readLine());
	
	double ancho;
	System.out.println("Introduzca ahora el ancho de la bandera en cm: ");	
	ancho = Double.parseDouble(System.console().readLine());
	
	String bordado;
	System.out.println("¿Quiere que la bandera tenga el escudo bordado (s/n)?");
	bordado = System.console().readLine();	
	
	double precioEscudo = 0;
	
	switch (bordado) {
	case "s":
	precioEscudo = 2.50;
	break;
	case "n": 
	precioEscudo = 0.00;
	default:
	System.out.println("Error al introducir el bordado del escudo");
	
	}
	
	double bandera = (altura * ancho);
	double precio = (0.01 * bandera);
	double gastoEnvio = 3.25;
	double total = (precio + precioEscudo + gastoEnvio);
	
	System.out.println("Gracias, aquí tiene el desglose de su compra:");
	System.out.printf("Bandera de %.2f cm2     %10.2f€\n", bandera, precio);
	System.out.printf("Escudo                   %10.2f€\n", precioEscudo);
	System.out.printf("Gastos de envío         %10.2f€\n", gastoEnvio);
	System.out.printf("----------------------------------------\n");
	System.out.printf("TOTAL:                   %10.2f€\n", total);
		
  }
}
