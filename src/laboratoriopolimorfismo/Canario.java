package laboratoriopolimorfismo;

/**
 * Implementación animal (ave) de {@link PuedeCantar}.
 */
public class Canario implements PuedeCantar {

    private final String nombre;

    public Canario() {
        this("Canario");
    }

    public Canario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " canta: pio pio pio");
    }
}
