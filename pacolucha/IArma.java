package pacolucha; // paquete donde se agrupan las clases del juego

public interface IArma { // interfaz que define el comportamiento mínimo de un arma
    int atacar(); // método que devuelve el daño que produce el arma
    String getNombre(); // método que devuelve el nombre del arma
} // fin de la interfaz IArma
