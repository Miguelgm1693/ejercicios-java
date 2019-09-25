public class Ejercicio10 {
  public static void main(String [] args){
	
		String negro = "\033[30m";
	  String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";


	System.out.println(naranja + "             *****" + negro +   "   ║       ");
	System.out.println(naranja + "            *******" + negro +  "  ║       ");
	System.out.println(naranja + "           *********" + negro +" ║       ");
	System.out.println(naranja + "          ***********" + negro + "║       ");
	System.out.println(naranja + "         *************       ");
	System.out.println(naranja + "        ***************      ");
	System.out.println(morado + "        ┏━━━━━━━━━━━━━┓      ");
	System.out.println(morado + "        ┃██" + celeste +"┌──┐" + morado + "█" + celeste +"┌──┐" + morado +"██┃      ");
	System.out.println(morado + "        ┃██" + celeste + "│  │" + morado + "█" + celeste +"│  │" + morado +"██┃      ");
	System.out.println(morado + "        ┃██" + celeste +"└──┘" + morado +"█" + celeste +"└──┘" + morado +"██┃      ");
	System.out.println(morado + "        ┃█████████████┃      ");
	System.out.println(morado + "        ┃████" + rojo +"┏━━━━┓" + morado +"███┃      ");
	System.out.println(morado + "        ┃████" + rojo +"┃    ┃" + morado +"███┃      ");
	System.out.println(morado + "        ┃████" + rojo +"┃   ·┃" + morado +"███┃      ");
	System.out.println(morado + "        ┃████" + rojo +"┃    ┃" + morado +"███┃      ");
	System.out.println(morado + "        ┗━━━━" + rojo +"┻━━━━┻" + morado +"━━━┛      ");
	System.out.println(blanco + "     CASA DE COLOR" + morado + " MORADO                         ");

 }
}
