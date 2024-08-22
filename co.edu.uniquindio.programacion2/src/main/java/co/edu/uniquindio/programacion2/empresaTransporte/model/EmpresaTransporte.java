package co.edu.uniquindio.programacion2.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;

    private List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private List<VehiculoPasajero> listaVehiculosPasajeros = new ArrayList<>();
    private List<Propietario> listaAsociados = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoPasajero> getListaVehiculosPasajeros() {
        return listaVehiculosPasajeros;
    }

    public void setListaVehiculosPasajeros(List<VehiculoPasajero> listaVehiculosPasajeros) {
        this.listaVehiculosPasajeros = listaVehiculosPasajeros;
    }

    public List<Propietario> getListaPropietarios() {
        return listaAsociados;
    }

    public void setListaAsociados(List<Propietario> listaAsociados) {
        this.listaAsociados = listaAsociados;
    }
}
