package exercise3.main;

import exercise3.entities.Alumno;
import exercise3.service.AlumnoService;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
 * alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
 * con sus 3 notas.
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 * toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 * del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */
public class Main {
    public static void main(String[] args) {
        AlumnoService aService = new AlumnoService();

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        Integer n1;
        Integer n2;
        Integer n3;
        String respuesta = "";

        do {
            System.out.println("Introducir nombre");
            nombre = scanner.next();
            System.out.println("Introducir nota 1");
            n1 = scanner.nextInt();
            System.out.println("Introducir nota 2");
            n2 = scanner.nextInt();
            System.out.println("Introducir nota 3");
            n3 = scanner.nextInt();

            Alumno a = aService.crearAlumno(nombre, n1, n2, n3);
            System.out.println("Desea continuar? S/N");
            respuesta = scanner.next();
        } while(respuesta.equalsIgnoreCase("s"));

        Double promedio = aService.notaFinal("Fernando");
    }
}
