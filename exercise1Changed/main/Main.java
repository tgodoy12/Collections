package exercise1Changed.main;

import exercise1Changed.service.PerroService;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */

public class Main {
    public static void main(String[] args) {
        PerroService perroServ = new PerroService();
        perroServ.fabircaPerros();

    }
}
