package pacolucha; // paquete del proyecto

import java.util.Random; // import para generar probabilidad aleatoria

// subclase que representa a un ninja cibernético con su propia habilidad
public class NinjaCibernetico extends Personaje {

    public NinjaCibernetico(String nombre, IArma arma) { // constructor que inicializa con hp predeterminado
        super(nombre, 100, arma); // llama al constructor de la clase base con 100 HP
    } // fin del constructor

    @Override
    public void habilidadEspecial() { // implementación de la habilidad especial del ninja
        if (new Random().nextInt(100) < 20) { // 20% de probabilidad de activarse
            System.out.println(nombre + " activa su escudo digital y evita el próximo ataque!"); // informa la activación
            this.hp += 10; // otorga 10 HP como efecto defensivo temporal
        } // fin del if
    } // fin del método habilidadEspecial
} // fin de la clase NinjaCibernetico
