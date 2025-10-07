package pacolucha; // paquete del proyecto

// clase que controla la lógica de combate entre dos personajes
public class JuegoLucha {

    public void iniciarPelea(Personaje p1, Personaje p2) { // método que inicia y controla la pelea
       System.out.println("\u001B[31m\n == COMIENZA LA PELEA == \u001B[0m");
 // imprime cabecera de inicio
        System.out.println("\u001B[1m\u001B[35m" + p1.getNombre() + " VS " + p2.getNombre() + "\u001B[0m\n"); // muestra los contendientes

        Personaje actual = p1; // inicializamos el turno con p1 por defecto

        while (p1.estaVivo() && p2.estaVivo()) { // bucle principal mientras ambos estén vivos
            Personaje oponente = (actual == p1) ? p2 : p1; // determina el oponente del turno actual

            actual.atacar(oponente); // el personaje actual ataca al oponente

            actual.habilidadEspecial(); // intenta activar su habilidad especial

           System.out.println("\u001B[32m--> " + p1.getNombre() + " HP: " + p1.getHP() +
                   " | " + p2.getNombre() + " HP: " + p2.getHP() + "\u001B[0m\n");


            actual = oponente; // cambia el turno al otro personaje

            try { Thread.sleep(800); } catch (InterruptedException e) { } // pequeña pausa para fluidez visual
        } // fin del while

        Personaje ganador = p1.estaVivo() ? p1 : p2; // determina el ganador
        System.out.println(" El ganador es " + ganador.getNombre() + " "); // imprime el ganador
    } // fin del método iniciarPelea
} // fin de la clase JuegoLucha
