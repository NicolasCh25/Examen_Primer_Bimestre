import java.util.Scanner;
import example.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Los países disponibles para buscar son: España, Japón, Ecuador, Colombia, Argentina, Brasil.");
            System.out.print("Ingrese el nombre del país: ");
            String nombrePais = scanner.nextLine();

            Pais pais;
            Ciudad ciudad;
            Capital capital;
            Metropolis metropolis;

            if (nombrePais.equalsIgnoreCase("España")) {
                pais = new Pais("España", 46719142, "Europa");
                ciudad = new Ciudad("España", 46719142, "Europa", "Madrid", 3200000);
                capital = new Capital("España", 46719142, "Europa", "Madrid", 3200000, "Español");
                metropolis = new Metropolis("España", 46719142, "Europa", "Madrid", 3200000, "Español", 607);
            } else if (nombrePais.equalsIgnoreCase("Japón")) {
                pais = new Pais("Japón", 126476461, "Asia");
                ciudad = new Ciudad("Japón", 126476461, "Asia", "Tokio", 13929286);
                capital = new Capital("Japón", 126476461, "Asia", "Tokio", 13929286, "Japonés");
                metropolis = new Metropolis("Japón", 126476461, "Asia", "Tokio", 13929286, "Japonés", 2190);
            } else if (nombrePais.equalsIgnoreCase("Ecuador")) {
                pais = new Pais("Ecuador", 17643060, "América del Sur");
                ciudad = new Ciudad("Ecuador", 17643060, "América del Sur", "Quito", 2000000);
                capital = new Capital("Ecuador", 17643060, "América del Sur", "Quito", 2000000, "Español");
                metropolis = new Metropolis("Ecuador", 17643060, "América del Sur", "Quito", 2000000, "Español", 300);
            } else if (nombrePais.equalsIgnoreCase("Colombia")) {
                pais = new Pais("Colombia", 50882891, "América del Sur");
                ciudad = new Ciudad("Colombia", 50882891, "América del Sur", "Bogotá", 8000000);
                capital = new Capital("Colombia", 50882891, "América del Sur", "Bogotá", 8000000, "Español");
                metropolis = new Metropolis("Colombia", 50882891, "América del Sur", "Bogotá", 8000000, "Español", 1580);
            } else if (nombrePais.equalsIgnoreCase("Argentina")) {
                pais = new Pais("Argentina", 45195777, "América del Sur");
                ciudad = new Ciudad("Argentina", 45195777, "América del Sur", "Buenos Aires", 3050000);
                capital = new Capital("Argentina", 45195777, "América del Sur", "Buenos Aires", 3050000, "Español");
                metropolis = new Metropolis("Argentina", 45195777, "América del Sur", "Buenos Aires", 3050000, "Español", 2030);
            } else if (nombrePais.equalsIgnoreCase("Brasil")) {
                pais = new Pais("Brasil", 211049527, "América del Sur");
                ciudad = new Ciudad("Brasil", 211049527, "América del Sur", "Brasilia", 3055149);
                capital = new Capital("Brasil", 211049527, "América del Sur", "Brasilia", 3055149, "Portugués");
                metropolis = new Metropolis("Brasil", 211049527, "América del Sur", "Brasilia", 3055149, "Portugués", 5800);
            } else {
                System.out.println("No tenemos datos del país ingresado, verifique si escribio bien el nombre del país.");
                return;
            }

            System.out.println(metropolis.informacionCompletaMetropolis());

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
