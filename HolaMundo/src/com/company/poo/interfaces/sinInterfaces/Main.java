package com.company.poo.interfaces.sinInterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado juan = new Empleado("Juan", 30, 40000, true);
        Empleado patricia = new Empleado("patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        // Guardar empleados
        empleadoCRUD.save(juan);
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(roberto);

        // Consultar empleados
        List<Empleado> empleado = empleadoCRUD.findAll();
        System.out.println(empleado);
    }
}
