package Ejercicio5;

/**
 *  -- EJERCICIO 5 --
 *
 *  - Crear una interfaz "CocheCRUD"
 *  - Crear una implementación "CocheCRUDImpl" que implemente dicha interfaz
 *  - Agregar métodos como:
 *      - save()
 *      - findAll()
 *      - delete()
 *    Estos métodos solamente deben imprimir en consola el nombre de su respectivo método
 *  - Desde una clase Main, crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos
 */
public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        CocheCRUDImpl honda = new CocheCRUDImpl();

        honda.findAll();
        honda.delete();
        honda.save();

    }
}
