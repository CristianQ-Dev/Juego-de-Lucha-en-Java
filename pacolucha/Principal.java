package pacolucha; // paquete del proyecto

import java.util.Scanner; // para leer entrada por consola

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // lector de entrada por consola

        // === NOMBRE DEL JUGADOR 1 ===
        System.out.print("Ingrese el nombre del Jugador 1: ");
        String nombreJugador1 = sc.nextLine(); // lee el nombre del jugador 1

        // === SELECCIÓN DE PERSONAJE JUGADOR 1 ===
        System.out.println("\u001B[33m\n=== SELECCIÓN DE PERSONAJE PARA " + nombreJugador1 + " ===\n"
                + "1. Luchador Callejero\n"
                + "2. Ninja Cibernético\n"
                + "3. Boxeador Profesional\n"
                + "Elige tu personaje (1-3): \u001B[0m");
        int opcionPersonaje1 = sc.nextInt();

// === SELECCIÓN DE ARMA JUGADOR 1 ===
        Arma[] armas = Arma.obtenerArmasDisponibles(); // obtiene el listado de armas disponibles
        System.out.println("\u001B[33m\n=== SELECCIÓN DE ARMA PARA " + nombreJugador1 + " ===\u001B[0m");
        for (int i = 0; i < armas.length; i++) {
            System.out.println("\u001B[33m" + (i + 1) + ". " + armas[i].getNombre() + "\u001B[0m");
        }

        System.out.print("Elige tu arma (1-" + armas.length + "): ");
        int opcionArma1 = sc.nextInt();

        IArma armaSeleccionada1 = armas[Math.max(0, Math.min(opcionArma1 - 1, armas.length - 1))];

        Personaje jugador1;
        switch (opcionPersonaje1) {
            case 1 ->
                jugador1 = new LuchadorCallejero(nombreJugador1, armaSeleccionada1);
            case 2 ->
                jugador1 = new NinjaCibernetico(nombreJugador1, armaSeleccionada1);
            case 3 ->
                jugador1 = new Boxeador(nombreJugador1, armaSeleccionada1);
            default ->
                jugador1 = new LuchadorCallejero(nombreJugador1, armaSeleccionada1);
        }

        sc.nextLine(); // limpia el buffer

        // === NOMBRE DEL JUGADOR 2 ===
        System.out.print("\nIngrese el nombre del Jugador 2: ");
        String nombreJugador2 = sc.nextLine(); // lee el nombre del jugador 2

        // === SELECCIÓN DE PERSONAJE JUGADOR 2 === (en color morado)
        System.out.println("\u001B[35m\n=== SELECCIÓN DE PERSONAJE PARA " + nombreJugador2 + " ===\n"
                + "1. Luchador Callejero\n"
                + "2. Ninja Cibernético\n"
                + "3. Boxeador Profesional\n"
                + "Elige tu personaje (1-3): \u001B[0m");

        int opcionPersonaje2 = sc.nextInt();

        // === SELECCIÓN DE ARMA JUGADOR 2 ===
        System.out.println("\n=== SELECCIÓN DE ARMA PARA " + nombreJugador2 + " ===");
        for (int i = 0; i < armas.length; i++) {
            System.out.println("\u001B[35m" + (i + 1) + ". " + armas[i].getNombre() + "\u001B[0m");
        }

        System.out.print("Elige tu arma (1-" + armas.length + "): ");
        int opcionArma2 = sc.nextInt();

        IArma armaSeleccionada2 = armas[Math.max(0, Math.min(opcionArma2 - 1, armas.length - 1))];

        Personaje jugador2;
        switch (opcionPersonaje2) {
            case 1 ->
                jugador2 = new LuchadorCallejero(nombreJugador2, armaSeleccionada2);
            case 2 ->
                jugador2 = new NinjaCibernetico(nombreJugador2, armaSeleccionada2);
            case 3 ->
                jugador2 = new Boxeador(nombreJugador2, armaSeleccionada2);
            default ->
                jugador2 = new LuchadorCallejero(nombreJugador2, armaSeleccionada2);
        }

        // === INICIO DEL JUEGO ===
        JuegoLucha juego = new JuegoLucha();
        juego.iniciarPelea(jugador1, jugador2);

        sc.close(); // cierra el Scanner
    }
}
