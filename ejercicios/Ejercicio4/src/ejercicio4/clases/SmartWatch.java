package ejercicio4.clases;

public class SmartWatch extends SmartDevice {
    String colorCorrea;
    int radioScreen;
    String operativeSystem;

    public SmartWatch() {
    }

    public SmartWatch(String marca, int year, double weight, String color, int ram, boolean cargador, String colorCorrea, int radioScreen) {
        super(marca, year, weight, color, ram, cargador);
        this.colorCorrea = colorCorrea;
        this.radioScreen = radioScreen;
    }

    public SmartWatch(String marca, String colorCorrea, String operativeSystem) {
        super(marca);
        this.colorCorrea = colorCorrea;
        this.operativeSystem = operativeSystem;
    }

    public void carcasaGratis (int year) {
        if (year >= 2021) {
            System.out.println("Contiene una carcasa de regalo");
            System.out.println("Año:" + year);
        } else {
            System.out.println("No contiene carcasa de regalo");
            System.out.println("Año:" + year);
        }
    }
}
