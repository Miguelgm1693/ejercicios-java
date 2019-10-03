public class Ejercicio10 {
  public static void main(String [] args) {
    // Decir mes y día de nacimiento y que el programa nos lo resuelva con nuestro horóscopo.
      
    System.out.println("¡Adivina tu horóscopo!");
    System.out.println("Dime tu fecha de nacimiento y sabrás cuál es tu horóscopo.");
    
    int mes;
    System.out.print("Dime tu mes de nacimiento con número (1-12): ");
    mes = Integer.parseInt(System.console().readLine());
    
    int dia;
    System.out.print("Dime tu día de nacimiento: ");
    dia = Integer.parseInt(System.console().readLine());
    
    String horoscopo = "";
    
    switch(mes) {
      case 1:
        if (dia < 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;
      case 2:
        if (dia < 20) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;
      case 3:
        if (dia < 21) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break;
      case 4:
        if (dia < 21) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break;
      case 5:
        if (dia < 20) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Géminis";
        }
        break;
      case 6:
        if (dia < 22) {
          horoscopo = "Géminis";
        } else {
          horoscopo = "Cáncer";
        }
        break;
      case 7:
        if (dia < 22) {
          horoscopo = "Cáncer";
        } else {
          horoscopo = "Leo";
        }
        break;
      case 8:
        if (dia < 24) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break;
      case 9:
        if (dia < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break;
      case 10:
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break;
      case 11:
        if (dia < 23) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
      case 12:
        if (dia < 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        break;
      default:
      System.out.println("El día (1-31) o mes (1-12) son erroneos.");
    }
    
    System.out.println(horoscopo);   

 }   
}

