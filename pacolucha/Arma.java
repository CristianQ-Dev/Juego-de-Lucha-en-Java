package pacolucha; // paquete del proyecto

import java.util.Random; // importamos Random para generar daño aleatorio

public class Arma implements IArma { // clase que implementa la interfaz IArma y representa un arma genérica
    private String nombre; // nombre del arma
    private int danioMin; // daño mínimo que el arma puede causar
    private int danioMax; // daño máximo que el arma puede causar

    public Arma(String nombre, int danioMin, int danioMax) { // constructor que inicializa los campos del arma
        this.nombre = nombre; // asigna el nombre pasado en el constructor
        this.danioMin = danioMin; // asigna el daño mínimo pasado en el constructor
        this.danioMax = danioMax; // asigna el daño máximo pasado en el constructor
    } // fin del constructor

    @Override
    public int atacar() { // método que calcula y devuelve un daño aleatorio dentro del rango
        Random rand = new Random(); // creamos una instancia de Random
        int rango = danioMax - danioMin + 1; // calculamos el rango de valores posibles
        return rand.nextInt(rango) + danioMin; // devolvemos un valor aleatorio entre danioMin y danioMax inclusive
    } // fin del método atacar

    @Override
    public String getNombre() { // método que devuelve el nombre del arma
        return nombre; // retorna el nombre almacenado
    } // fin del método getNombre

    public static Arma[] obtenerArmasDisponibles() { // método estático que devuelve un listado de armas disponibles
        return new Arma[] { // retorna un arreglo con instancias de Arma
            new Arma("Espada Legendaria", 15, 30), // arma: Espada Legendaria con daño 15-30
            new Arma("Puños de Acero", 10, 25), // arma: Puños de Acero con daño 10-25
            new Arma("Bastón Eléctrico", 20, 35), // arma: Bastón Eléctrico con daño 20-35
            new Arma("Martillo Destructor", 25, 40), // arma: Martillo Destructor con daño 25-40
            new Arma("Katana Oscura", 30, 45), // arma: Katana Oscura con daño 30-45
            new Arma("Cuchillas Dobles", 18, 33) // arma: Cuchillas Dobles con daño 18-33
        }; // fin del arreglo de armas
    } // fin del método obtenerArmasDisponibles
} // fin de la clase Arma
