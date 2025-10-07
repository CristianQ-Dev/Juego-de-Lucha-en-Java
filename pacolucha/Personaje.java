package pacolucha; // paquete del proyecto

// clase abstracta que representa la estructura base de un personaje
public abstract class Personaje {
    protected String nombre; // nombre del personaje
    protected int hp; // puntos de vida del personaje
    protected IArma arma; // arma que usa el personaje

    public Personaje(String nombre, int hp, IArma arma) { // constructor base para todos los personajes
        this.nombre = nombre; // asigna el nombre
        this.hp = hp; // asigna los puntos de vida iniciales
        this.arma = arma; // asigna el arma inicial
    } // fin del constructor

    public void atacar(Personaje oponente) { // método para atacar a otro personaje
        int danio = arma.atacar(); // obtiene el daño que produce el arma
        oponente.hp -= danio; // resta ese daño a los puntos de vida del oponente
        if (oponente.hp < 0) oponente.hp = 0; // evita hp negativos
        System.out.println(nombre + " usa " + arma.getNombre() + " y causa " +
         danio + " de daño a " + oponente.nombre); // imprime el resultado del ataque
    } // fin del método atacar

    public boolean estaVivo() { // método que verifica si el personaje sigue con vida
        return hp > 0; // retorna true si tiene más de 0 hp
    } // fin del método estaVivo

    public String getNombre() { // método que devuelve el nombre del personaje
        return nombre; // retorna el nombre
    } // fin del método getNombre

    public int getHP() { // método que devuelve los puntos de vida actuales
        return hp; // retorna el hp actual
    } // fin del método getHP

    public abstract void habilidadEspecial(); // método abstracto que obliga a las subclases a definir su habilidad especial
} // fin de la clase abstracta Personaje
