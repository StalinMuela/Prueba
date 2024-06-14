package Clases;
import java.util.Scanner;
public class TicketNormalVip extends Servicios{

    int SeleccionTicket;

    public TicketNormalVip() {
    }

    public TicketNormalVip(String nombre, Double costo, int asiento, String pasillo, int espacio, int servicio, int maletaadicional, double descuentoticket, int seleccionTicket) {
        super(nombre, costo, asiento, pasillo, espacio, servicio, maletaadicional, descuentoticket);
        SeleccionTicket = seleccionTicket;
    }

    public int getSeleccionTicket() {
        return SeleccionTicket;
    }

    public void setSeleccionTicket(int seleccionTicket) {
        SeleccionTicket = seleccionTicket;
    }

    public double TipoTicket(double costo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de servicio: ");
        System.out.println("1. Normal");
        System.out.println("2. Vip");
        System.out.println("Seleccione una opcion: ");
        SeleccionTicket = sc.nextInt();

        switch(SeleccionTicket){
            case 1:
                System.out.println("Seleccion del asiento");
                asiento = sc.nextInt();
                sc.nextLine();
                System.out.println("Seleccion del pasillo (Al final o Adelante)");
                pasillo = sc.nextLine();
                System.out.println("Seleccion de espacio para maleta");
                System.out.println("-- Defecto 1 maleta --");
                espacio = 1;
                System.out.println("Seleccion de espacio para una maleta adicional (1: Si / 2: No");
                maletaadicional = sc.nextInt();
                if (maletaadicional == 1){
                    maletaadicional = 1;
                    System.out.println("Se agregado un costo adicional");
                    costo = costo + 1.10;
                }else if (maletaadicional == 2){
                    maletaadicional = 0;
                    System.out.println("No agregado un costo adicional");
                }else{
                    System.out.println("Seleccione una opcion correcta");
                }
                servicio = 0;
                return costo;
            case 2:
                descuentoticket = (costo * 0.30);
                costo = costo - descuentoticket;
                System.out.println("Ingrese el numero del asiento: ");
                asiento = sc.nextInt();
                sc.nextLine();
                System.out.println("Seleccion del pasillo (Al final o Adelante): ");
                pasillo = sc.nextLine();
                System.out.println("Seleccion de espacio para maleta: ");
                System.out.println("-- Defecto 1 maleta --");
                espacio = 1;
                System.out.println("Seleccion de espacio para una maleta adicional (1: Si / 2: No): ");
                maletaadicional = sc.nextInt();
                if (maletaadicional == 1){
                    System.out.println("Se agregado un costo adicional");
                    costo = costo + 1.10;
                }else if (maletaadicional == 2){
                    System.out.println("No agregado un costo adicional");
                }else{
                    System.out.println("Seleccione una opcion correcta");
                }
                System.out.println("Seleccion de servicio: ");
                System.out.println("1. Con television");
                System.out.println("2. Con internet");
                System.out.println("3. Desayuno, Almurzo y Merienda");
                System.out.println("4. Almohada");
                servicio = sc.nextInt();
                if (servicio == 1){
                    servicio = 1;
                    costo = costo * 1.31;
                }else if (servicio == 2){
                    servicio = 1;
                    costo = costo * 1.29;
                }else if (servicio == 3){
                    servicio = 1;
                    costo = costo * 2.30;
                }else if (servicio == 4){
                    servicio = 1;
                    costo = costo * 0.30;
                }else{
                    System.out.println("Ingrese una opcion valida: ");
                }
                return costo;
            default:
                System.out.println("Ingresa correctamente");
                return 0;

        }
    }
}
