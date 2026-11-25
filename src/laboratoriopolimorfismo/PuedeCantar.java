package laboratoriopolimorfismo;

/**
 * Contrato común para cualquier entidad capaz de cantar.
 * <p>
 * El polimorfismo se basa en este tipo: el código cliente
 * trabaja con {@code PuedeCantar} sin conocer la clase concreta.
 */
public interface PuedeCantar {

    /**
     * Emite el canto característico de la implementación.
     */
    void cantar();
}
