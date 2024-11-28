package example;

public class Ciudad extends Pais {
    private String nombreCiudad;
    private int poblacionCiudad;

    // Constructor
    public Ciudad(String nombrePais, int poblacionPais, String continentePais, String nombreCiudad, int poblacionCiudad) {
        super(nombrePais, poblacionPais, continentePais);
        this.nombreCiudad = nombreCiudad;
        this.poblacionCiudad = poblacionCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public int getPoblacionCiudad() {
        return poblacionCiudad;
    }

    public String informacionCiudad() {
        return super.informacion() + "\nCiudad: " + nombreCiudad + "\nPoblación de la ciudad: " + poblacionCiudad;
    }
}
