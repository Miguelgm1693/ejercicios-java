public class Ejercicio23 {
  public static void main(String [] args) {
    // 
      
    System.out.println("En este programa vamos a calcular el precio final de un producto según su base imponible, el IVA aplicado y si tiene algún código de promoción");
    
    double baseImponible;
    System.out.println("Introduzca la base imponible del producto: ");
    baseImponible = Double.parseDouble(System.console().readLine());
    
    String tipoIva;
    System.out.println("Introduzca el tipo de IVA del producto (general, reducido o superreducido)");
    tipoIva = System.console().readLine();
    
    String codDescuento;
    System.out.println("Introduzca el codigo promocional (nopro, mitad, desc5, 5porc)");
    codDescuento = System.console().readLine();
    
    double tIva = 0;
        
    switch (tipoIva) {
	  case "general":
	  tIva = 0.21;
	  break;
	  case "reducido":
	  tIva = 0.10;
	  break;
	  case "superreducido":
	  tIva = 0.04;
	  break;
	  default:
	    System.out.println("IVA introducido erróneo");
	}
	
	double ivaReal = (baseImponible * tIva);
	double precio = (baseImponible + ivaReal);
	
	double codPromo = 0;
		
	switch (codDescuento) {
	  case "nopro":
	  break;
	  case "mitad":
	  codPromo = (precio / 2);
	  break;
	  case "desc5":
	  codPromo = (precio - 5);
	  break;
	  case "5porc":
	  codPromo = (precio - (precio *0.05));
	  break;
	  default:
	    System.out.println("El código de promoción introducido no es válido");
	}
	
	double total = (precio - (codPromo));
    
    System.out.printf("Base imponible   %10.2f€\n", baseImponible);
    System.out.printf("IVA      %.2f    %10.2f€\n", tIva, ivaReal);
    System.out.printf("Precio con IVA   %10.2f€\n", precio);
    System.out.printf("Cod. Descuento   %10.2f \n", codPromo);
    System.out.printf("------------------------------\n");
    System.out.printf("Total compra     %10.2f€\n", total);
    
 }   
}



