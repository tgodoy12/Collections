package exercise3.service;

import exercise3.entities.Alumno;

import java.util.ArrayList;

public class AlumnoService {
    private ArrayList<Alumno> alumnos;

    public AlumnoService() {
        this.alumnos = new ArrayList<>();
    }

    public Alumno crearAlumno(String nombre, Integer n1, Integer n2, Integer n3) {
        Alumno a = new Alumno(nombre);
        a.setNotas(agregarNotas(n1, n2, n3));
        alumnos.add(a);

        return a;
    }

    private ArrayList<Integer> agregarNotas(Integer n1, Integer n2, Integer n3) {
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);


        return notas;
    }

    public Double notaFinal(String nombre) {
        Integer indice = buscarAlumno(nombre);
        double promedio = 0;

        if (indice != null) {
            promedio = calcularPromedio(alumnos.get(indice).getNotas().get(0), alumnos.get(indice).getNotas().get(1), alumnos.get(indice).getNotas().get(2));
            System.out.println("Promedio: " + promedio);
            return promedio;
        } else{
            System.out.println("El nombre ingresado no pertenece a lista de alumnos");
        }
        return null;

    }

    private Integer buscarAlumno(String nombre) {


        Integer indice = null;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                indice = i;
                break;
            }
        }
        return indice;

    }

    private Double calcularPromedio(Integer n1, Integer n2, Integer n3) {
        Double promedio = (double) (n1 + n2 + n3) / 3;
        return promedio;
    }

}
