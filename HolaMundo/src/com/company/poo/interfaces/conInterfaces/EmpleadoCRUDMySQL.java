package com.company.poo.interfaces.conInterfaces;

import com.company.poo.interfaces.sinInterfaces.Empleado;

import java.util.List;

/**
 *  Utilizamos la palabra reservada "implements" para hacer referencia a la interfaz.
 *  Recordemos que:
 *  Extends -> Clases
 *  Implements -> Interfaces
 *
 */
public class EmpleadoCRUDMySQL implements EmpleadoCRUD {
    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
