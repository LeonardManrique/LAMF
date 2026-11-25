# LAMF — Laboratorio de polimorfismo (interfaces)

Ejemplo en Java del **polimorfismo por interfaz**: varias clases
implementan el mismo contrato (`PuedeCantar`) y el programa las trata
de forma uniforme.

## Idea central

```
PuedeCantar  ← interfaz (tipo abstracto)
    ↑
    ├── Persona
    ├── Canario
    └── Burro
```

`ProgramaInterfaz.hacerCantar(PuedeCantar)` no conoce la clase concreta.
Al llamar `cantar()`, la JVM ejecuta la implementación real (enlace dinámico).

## Cómo ejecutarlo

Con JDK instalado (sin NetBeans):

```bash
./run.sh
```

O manualmente:

```bash
mkdir -p build/classes
javac -d build/classes src/laboratoriopolimorfismo/*.java
java -cp build/classes laboratoriopolimorfismo.ProgramaInterfaz
```

También puedes abrirlo como proyecto NetBeans (`build.xml` / `nbproject`).

## Salida esperada

```
=== Coro polimórfico ===
Pavaroti canta: do re mi fa sol la si
Piolín canta: pio pio pio
Platero canta: hiaaa hiaaa hiaaa
```

## Estructura

| Archivo | Rol |
|---------|-----|
| `PuedeCantar.java` | Interfaz (contrato) |
| `Persona.java` / `Canario.java` / `Burro.java` | Implementaciones |
| `ProgramaInterfaz.java` | Cliente que usa el tipo abstracto |

## Autor

Leonard Manrique
