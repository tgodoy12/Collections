package exercise1.entities;

public class Raza {
    String nombreRaza;

    public Raza() {
    }

    public Raza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    @Override
    public String toString() {
        return "Raza{" +
                "nombreRaza='" + nombreRaza + '\'' +
                '}';
    }
}
