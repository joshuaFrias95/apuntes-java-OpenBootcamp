package ejercicio4.clases;

public class SmartPhone extends SmartDevice {

    double screenHeight;
    double screenwidth;
    int battery;

    public SmartPhone() {
    }

    public SmartPhone(String marca, int year, double weight, String color, int ram, boolean cargador, double screenHeight, double screenwidth, int battery) {
        super(marca, year, weight, color, ram, cargador);
        this.screenHeight = screenHeight;
        this.screenwidth = screenwidth;
        this.battery = battery;
    }

    public SmartPhone(String marca) {
        super(marca);
    }



    public void cargaRapida(boolean cargadorRapido) {
        if (cargadorRapido) {
            System.out.println("Cuenta con carga rápida");
        } else {
            System.out.println("No cuenta con carga rápida");
        }
    }


}
