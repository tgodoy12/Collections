package exercise1Changed.service;

import exercise1Changed.entities.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {
    private Scanner scanner;
    private ArrayList<Perro> razasPerros;

    //Es una buena práctica inicializar el arrayList y el scanner en el constructor del PerroService
    public PerroService() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.razasPerros = new ArrayList<>();
    }

    public Perro crearPerro() {
        System.out.println("Introducir nombre:");
        String nombre = scanner.next();

        System.out.println("Introducir raza:");
        String raza = scanner.next();

        return new Perro(nombre, raza);
    }

    private void agregarPerro(Perro p) {
        razasPerros.add(p);
    }

    //objetivo del ejericicio
    public void fabircaPerros() {
        String respuesta;
        do {
            Perro p = crearPerro();
            agregarPerro(p);
            System.out.println("¿Desea continuar? S/N");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));

        for (Perro aux: razasPerros) {
            System.out.println(aux.toString());
        }
    }

    /**
     * TODO
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
     * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
     * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
     * salir, se mostrará todos los perros guardados en el ArrayList.
     */
}
