package Ejercicio5;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {

        System.out.println("Este es el método save() implementado desde una interfaz");
    }

    @Override
    public void findAll() {

        System.out.println("Este es el método findAll() implementado desde una interfaz");
    }

    @Override
    public void delete() {

        System.out.println("Este es el método delete() implementado desde una interfaz");
    }
}
