package pacolucha; // paquete del proyecto

import java.util.Random; // import para generar probabilidad aleatoria

// subclase que representa a un luchador callejero con su propia habilidad
public class LuchadorCallejero extends Personaje {

    public LuchadorCallejero(String nombre, IArma arma) { // constructor que inicializa con hp predeterminado
        super(nombre, 120, arma); // llama al constructor de la clase base con 120 HP
    } // fin del constructor

    @Override
    public void habilidadEspecial() { // implementación de la habilidad especial del luchador
        if (new Random().nextInt(100) < 25) { // 25% de probabilidad de activarse
            System.out.println(nombre + " toma una bebida energética y recupera 15 de vida!"); // informa la activación
            this.hp += 15; // suma 15 HP al personaje
        } // fin del if
    } // fin del método habilidadEspecial
} // fin de la clase LuchadorCallejero
