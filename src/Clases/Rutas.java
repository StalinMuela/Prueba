package Clases;
import java.util.Scanner;
public class Rutas extends Pasajero{
    int ruta;
    Double valorruta;
    String name;

    public Rutas() {
    }

    public Rutas(String nombre, Double costo, int ruta, Double valorruta, String name) {
        super(nombre, costo);
        this.ruta = ruta;
        this.valorruta = valorruta;
        this.name = name;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public Double getValorruta() {
        return valorruta;
    }

    public void setValorruta(Double valorruta) {
        this.valorruta = valorruta;
    }

    public double rutas(double costo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rutas");
        System.out.println("1. Quito - Guayaquil");
        System.out.println("2. Quito - Tulcan ");
        System.out.println("3. Quito - Puyo");
        System.out.println("4. Quito - Riobamba");
        System.out.println("Seleccione una opcion: ");
        ruta = sc.nextInt();
        switch(ruta){
            case 1:
                name = "Quito - Guayaquil";
                System.out.println("Ruta 1");
                System.out.println("Quito - Guayaquil");
                System.out.println("Costo : 20$");
                valorruta = 20.0;
                return costo + valorruta;
            case 2:
                name = "Quito - Tulcan";
                System.out.println("Ruta 2");
                System.out.println("Quito - Guayaquil");
                System.out.println("Costo : 20$");
                valorruta = 17.50;
                return costo + valorruta;
            case 3:
                name = "Quito - Puyo";
                System.out.println("Ruta 3");
                System.out.println("Quito - Guayaquil");
                System.out.println("Costo : 20$");
                valorruta = 15.0;
                return costo + valorruta;
            case 4:
                System.out.println("Ruta 4");
                System.out.println("Quito - Guayaquil");
                System.out.println("Costo : 20$");
                valorruta = 17.50;
                return  costo + valorruta;
            default:
                System.out.println("Ingresa correctamente");
                return 0;
        }
    }
}
