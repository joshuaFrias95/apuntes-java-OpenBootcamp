package ejercicio4.clases;

public abstract class SmartDevice {

    public String marca;
    public int year;
    double weight;
    String color;
    int ram;
    boolean cargador;

    public SmartDevice() {}

    public SmartDevice(String marca, int year, double weight, String color, int ram, boolean cargador) {
        this.marca = marca;
        this.year = year;
        this.weight = weight;
        this.color = color;
        this.ram = ram;
        this.cargador = cargador;
    }

    public SmartDevice(String marca) {
        this.marca = marca;
    }

    public SmartDevice(String marca, boolean cargador) {
        this.marca = marca;
        this.cargador = cargador;
    }
}
