package example;

public class Metropolis extends Capital {
    private int areaMetropolitana; // en km²

    public Metropolis(String nombrePais, int poblacionPais, String continentePais, String nombreCiudad, int poblacionCiudad, String idiomaOficial, int areaMetropolitana) {
        super(nombrePais, poblacionPais, continentePais, nombreCiudad, poblacionCiudad, idiomaOficial);
        this.areaMetropolitana = areaMetropolitana;
    }

    public int getAreaMetropolitana() {
        return areaMetropolitana;
    }

    public String informacionCompletaMetropolis() {
        return super.informacionCompleta() + "\nÁrea metropolitana: " + areaMetropolitana + " km²";
    }
}
