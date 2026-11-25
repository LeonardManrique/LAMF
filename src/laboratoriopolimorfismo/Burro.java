package laboratoriopolimorfismo;

/**
 * Implementación animal (mamífero) de {@link PuedeCantar}.
 */
public class Burro implements PuedeCantar {

    private final String nombre;

    public Burro() {
        this("Burro");
    }

    public Burro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " canta: hiaaa hiaaa hiaaa");
    }
}
