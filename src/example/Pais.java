package example;

public class Pais {
    private String nombre;
    private int poblacion;
    private String continente;

    public Pais(String nombre, int poblacion, String continente) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public String getContinente() {
        return continente;
    }

    public String informacion() {
        return "País: " + nombre + "\nPoblación: " + poblacion + "\nContinente: " + continente;
    }
}
