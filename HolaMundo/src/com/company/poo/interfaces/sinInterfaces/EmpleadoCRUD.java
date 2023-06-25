package com.company.poo.interfaces.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *  C reate
 *  R etrieve/ Read
 *  U pdate
 *  D alate
 */
public class EmpleadoCRUD {

    // Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();


    // Operaciones CRUD

    // CREATE -- Guardar empleados
    public void save(Empleado empleado) {

        empleados.add(empleado);
    }

    //
    public List<Empleado> findAll() {

        return empleados;
    }
}
