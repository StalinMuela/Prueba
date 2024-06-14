package Clases;

import java.util.Scanner;

public class Pasajero {
    String nombre;
    Double costo = 0.0;

    public Pasajero() {
    }

    public Pasajero(String nombre, Double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void menu(){
        Pasajero p = new Pasajero();
        Rutas r = new Rutas();
        Scanner sc = new Scanner(System.in);
        TicketNormalVip tnv = new TicketNormalVip();

        System.out.println("---- SISTEMA DE EL BUHO ----- ");
        System.out.println("Datos");
        System.out.print("Ingrese el nombre a la Factura: ");
        p.setNombre(sc.nextLine());
        System.out.println("-------------------------------");
        System.out.println("--- Rutas Disponibles ----");
        r.rutas(costo);
        System.out.println("-------------------------------");
        System.out.println("Seleccion de tipo de Ticket");
        tnv.TipoTicket(costo);
        System.out.println("--------------------------------");
        System.out.println("Informacion del Boleto");
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Costo: " + p.costo);
        System.out.println("Ruta: " + r.name);
        System.out.println("Asiento: " + tnv.asiento);
        System.out.println("Pasillo: " + tnv.pasillo);
        System.out.println("Maleta adicional: " + tnv.maletaadicional);
        System.out.println("Servicios: " + tnv.servicio);
        System.out.println("-------------------------------");

    }
}
