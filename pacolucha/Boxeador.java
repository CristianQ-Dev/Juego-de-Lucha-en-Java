package pacolucha; // paquete del proyecto

import java.util.Random; // import para generar probabilidad aleatoria

// subclase que representa a un boxeador con su propia habilidad especial
public class Boxeador extends Personaje {

    public Boxeador(String nombre, IArma arma) { // constructor que inicializa con hp predeterminado
        super(nombre, 110, arma); // llama al constructor de la clase base con 110 HP
    } // fin del constructor

    @Override
    public void habilidadEspecial() { // implementación de la habilidad especial del boxeador
        if (new Random().nextInt(100) < 30) { // 30% de probabilidad de activarse
            System.out.println(nombre + " lanza un golpe crítico y gana fuerza temporal!"); // informa la activación
            this.hp += 5; // recupera 5 HP como efecto de motivación
        } // fin del if
    } // fin del método habilidadEspecial
} // fin de la clase Boxeador
