package example;

public class Capital extends Ciudad {
    private String idiomaOficial;

    public Capital(String nombrePais, int poblacionPais, String continentePais, String nombreCiudad, int poblacionCiudad, String idiomaOficial) {
        super(nombrePais, poblacionPais, continentePais, nombreCiudad, poblacionCiudad);
        this.idiomaOficial = idiomaOficial;
    }

    public String getIdiomaOficial() {
        return idiomaOficial;
    }

    public String informacionCompleta() {
        return super.informacionCiudad() + "\nIdioma oficial: " + idiomaOficial;
    }
}
