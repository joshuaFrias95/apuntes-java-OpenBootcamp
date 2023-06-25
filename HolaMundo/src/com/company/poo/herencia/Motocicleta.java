package com.company.poo.herencia;

import com.company.poo.clases.Motor.Motor;
import com.company.poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta() {}

    // Generamos constructor de clase Motocicleta con propiedades de la clase padre
    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        // La palabra reservada super nos permite acceder a los parámetros de la clase padre
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
