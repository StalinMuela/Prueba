package Clases;

public class Ticket extends Pasajero{
    int asiento;
    String pasillo;
    int espacio;

    public Ticket() {
    }

    public Ticket(String nombre, Double costo, int asiento, String pasillo, int espacio) {
        super(nombre, costo);
        this.asiento = asiento;
        this.pasillo = pasillo;
        this.espacio = espacio;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
}
