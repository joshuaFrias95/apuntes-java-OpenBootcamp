package com.company.poo.interfaces.conInterfaces;

import com.company.poo.interfaces.sinInterfaces.Empleado;

import java.util.List;

/**
 * Se declaran los métodos, no se implementan.
 * La implementación se hace desde las clases que creemos.
 * Una interfaz nos va a indicar los métodos que debemos utilizar
 * pero una plantilla para que posteriormente la implementemos en
 * nuestras clases.
 *
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
