package exercise1.service;

import exercise1.entities.Raza;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaService {
    private ArrayList<String> razaArray;

    public RazaService() {
        this.razaArray = new ArrayList<>();
    }

    private Raza crearRaza(String nombreRaza) {
        return new Raza(nombreRaza);
    }

    private void agregarRaza(String nombreRaza) {
        razaArray.add(nombreRaza);
    }

    private void mostrarLista() {
        for (String aux: razaArray) {
            System.out.println(aux.toString());
        }
    }

    public void agregarMuchasRazas() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        do {
            System.out.println("Introducir raza:");
            Raza r = crearRaza(scanner.next());
            agregarRaza(r.getNombreRaza());

            System.out.println("¿Desea continuar? S/N");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));
        //agregar constraint para el bulce de continuar S/N
        mostrarLista();
    }

    public void eliminarRazaLista(String nombreRaza) {
        Iterator<String> it = razaArray.iterator();

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(nombreRaza)) {
                it.remove();
            }
        }

        mostrarLista();
    }


}
