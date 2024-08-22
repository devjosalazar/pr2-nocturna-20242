package co.edu.uniquindio.programacion2.interfaces.model;

import co.edu.uniquindio.programacion2.interfaces.services.ICarcasa1;
import co.edu.uniquindio.programacion2.interfaces.services.ICarcasa2;

public class Calculadora implements ICarcasa1, ICarcasa2 {
    @Override
    public int sumar(int a, int b) {
        return 0;
    }

    @Override
    public double multiplicar(double a, double b) {
        return 0;
    }

    @Override
    public double multiplicar(double a) {
        return 0;
    }

    public double multiplicar() {
        return 0;
    }
}
