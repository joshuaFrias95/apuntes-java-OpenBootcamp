package com.company.poo.interfaces.conInterfaces;

import com.company.poo.interfaces.sinInterfaces.Empleado;

public class Main {

    // Implementamos la interfaz y sus métodos
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();

    //Podemos modificar el método "EmpleadoCRUDMySQL()" por "EmpleadoCRUDExcel()" y no habría problema,
    //ya que los implementamos la interfaz
    //static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();
    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
