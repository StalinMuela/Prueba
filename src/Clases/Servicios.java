package Clases;

public class Servicios extends Ticket{
    int servicio;
    int maletaadicional;
    double descuentoticket;

    public Servicios() {
    }

    public Servicios(String nombre, Double costo, int asiento, String pasillo, int espacio, int servicio, int maletaadicional, double descuentoticket) {
        super(nombre, costo, asiento, pasillo, espacio);
        this.servicio = servicio;
        this.maletaadicional = maletaadicional;
        this.descuentoticket = descuentoticket;
    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    public int getMaletaadicional() {
        return maletaadicional;
    }

    public void setMaletaadicional(int maletaadicional) {
        this.maletaadicional = maletaadicional;
    }

    public double getDescuentoticket() {
        return descuentoticket;
    }

    public void setDescuentoticket(double descuentoticket) {
        this.descuentoticket = descuentoticket;
    }
}
