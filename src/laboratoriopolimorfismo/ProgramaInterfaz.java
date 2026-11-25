package laboratoriopolimorfismo;

/**
 * Demuestra polimorfismo por interfaz: distintas clases responden
 * al mismo mensaje {@link PuedeCantar#cantar()} de formas distintas.
 */
public class ProgramaInterfaz {

    public static void main(String[] args) {
        PuedeCantar[] coro = {
            new Persona("Pavaroti"),
            new Canario("Piolín"),
            new Burro("Platero")
        };

        System.out.println("=== Coro polimórfico ===");
        for (PuedeCantar cantor : coro) {
            hacerCantar(cantor);
        }
    }

    /**
     * Recibe el tipo abstracto {@link PuedeCantar}.
     * En tiempo de ejecución se invoca la implementación concreta (enlace dinámico).
     */
    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
}
