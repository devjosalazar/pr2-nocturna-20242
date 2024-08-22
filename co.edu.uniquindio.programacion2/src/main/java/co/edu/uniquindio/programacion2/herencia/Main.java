package co.edu.uniquindio.programacion2.herencia;

import co.edu.uniquindio.programacion2.herencia.model.Avion;
import co.edu.uniquindio.programacion2.herencia.model.Carro;
import co.edu.uniquindio.programacion2.herencia.model.Vehiculo;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        //crearInstancias();
        encender();
    }

    private static void crearInstancias() {
        Vehiculo vehiculo1 = new Carro();
    }

    private static void encender() {
        Carro carro = new Carro("iueueu987");
        Avion avion = new Avion();
        carro.encender(3334444);
        carro.encender("la llave");
    }
}
