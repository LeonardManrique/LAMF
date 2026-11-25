package laboratoriopolimorfismo;

/**
 * Implementación humana de {@link PuedeCantar}.
 */
public class Persona implements PuedeCantar {

    private final String nombre;

    public Persona() {
        this("Persona");
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " canta: do re mi fa sol la si");
    }
}
