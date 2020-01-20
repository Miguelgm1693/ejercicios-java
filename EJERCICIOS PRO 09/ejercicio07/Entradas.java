package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Entradas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);
        int opcion1;
        do {
            System.out.println("ExpoCoches Campanillas, elija una de las opciones: ");
            System.out.println("1.Venta de Entrada.");
            System.out.println("2.Mostrar nº entradas quedan.");
            System.out.println("3.Salir.");
            opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("¿De que zona quiere las entradas? \n 1.Zona Principal\n 2.Zona Compra-Venta\n 3.Zona VIP\n");
                    int opcion2 = sc.nextInt();
                    int cantidad;
                    if (opcion2 == 1) {
                        System.out.println("Quedan : " + principal.getEntradasPorVender());
                        System.out.println("¿Cuántas entradas quiere?");
                        cantidad = sc.nextInt();
                        principal.vender(cantidad);
                    }
                    if (opcion2 == 2) {
                        System.out.println("Quedan : " + compraventa.getEntradasPorVender());
                        System.out.println("¿Cuántas entradas quiere?");
                        cantidad = sc.nextInt();
                        compraventa.vender(cantidad);
                    }
                    if (opcion2 == 3) {
                        System.out.println("Quedan : " + vip.getEntradasPorVender());
                        System.out.println("¿Cuántas entradas quiere?");
                        cantidad = sc.nextInt();
                        vip.vender(cantidad);
                    }

                    break;
                case 2:
                    System.out.println("Zona Principal : " + principal.getEntradasPorVender() + "\n"
                            + "Zona Compra-Venta : " + compraventa.getEntradasPorVender() + "\n"
                            + "Zona VIP : " + vip.getEntradasPorVender() + "\n");
                    break;
                default:
                    break;
            }
        } while (opcion1 < 3);
    }
}


