package co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.inter.impl;

import co.edu.uniquindio.programacion2.patrones_creacionales.factoryMethod.inter.IConexion;
public class ConexionVacia implements IConexion{

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

}
