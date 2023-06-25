package com.company.poo.clases;

import com.company.poo.clases.Motor.Motor;

/**
 *  -- ESTRUCTURA DE UNA CLASE --
 *  1. Atributos: Son todos los valores que puede tener nuestra clase. Puede tener cualquier tipo de valor y
 *  nos va a permitir guardar todas las características necesarias para describir nuestros objetos a futuro.
 *  2. Constructores: Funciones o métodos especiales que permitirán generar objetos provenientes
 *  de esta plantilla (clase). Se crean comenzando con la palabra reservada public y seguido del nombre como si de una
 *  función se tratara. Estos constructores se podrán utilizar para agregar atributos a los objetos y las clases.
 *  También es posible generar sobrecarga como en cualquier función.
 *  3. Métodos: Los métodos nos van a permitir otorgarle comportamientos a nuestros objetos a partir de su clase,
 *  podemos otorgarle la visibilidad que prefiramos.
 */
public class Vehiculo {

    // 1. Atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    // Relacionamos una clase con otra clase para hacer más escalable el programa
    Motor motor;


    // 2. Constructores
    public Vehiculo() {}

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    public Vehiculo(String fabricante, String modelo) {

        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    // 3. Métodos (Comportamientos)
    public void acelerar(int quantity) {

        this.speed += quantity;
    }

    //getter y setter


    //toString
}
