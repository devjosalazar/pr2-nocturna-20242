package co.edu.uniquindio.programacion2.empresaTransporte;

import co.edu.uniquindio.programacion2.empresaTransporte.model.EmpresaTransporte;
import co.edu.uniquindio.programacion2.empresaTransporte.model.Propietario;
import co.edu.uniquindio.programacion2.empresaTransporte.model.VehiculoCarga;
import co.edu.uniquindio.programacion2.empresaTransporte.model.VehiculoPasajero;

import java.util.ArrayList;
import java.util.List;

public class MainTransporte {
    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = inicializarDatos();
        int ejes = 5;
        mostrarVehiculosCargaMayorEje(empresaTransporte, ejes);
    }

    private static void mostrarVehiculosCargaMayorEje(EmpresaTransporte empresaTransporte,
                                                       int ejes) {
        for (Propietario propietario: empresaTransporte.getListaPropietarios()) {
            for (VehiculoCarga vehiculo: propietario.getListaVehiculosAsociados()) {
                if(vehiculo.getNumeroEjes() >= ejes){
                    System.out.println(vehiculo.toString());
                }
            }
        }
    }


    private static EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        Propietario propietario1 = new Propietario();
        propietario1.setNombre("Pedro");
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Ana");

        VehiculoCarga vehiculoCarga1 = new VehiculoCarga();
        vehiculoCarga1.setPlaca("RRD098");
        vehiculoCarga1.setNumeroEjes(5);

        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        vehiculoCarga2.setPlaca("XXX096");
        vehiculoCarga2.setNumeroEjes(3);

        VehiculoCarga vehiculoCarga3 = new VehiculoCarga();
        vehiculoCarga3.setPlaca("77X096");
        vehiculoCarga3.setNumeroEjes(5);

        propietario1.setVehiculo(vehiculoCarga1);
        propietario1.getListaVehiculosAsociados().add(vehiculoCarga2);
        propietario1.getListaVehiculosAsociados().add(vehiculoCarga3);

        propietario2.setVehiculo(vehiculoCarga2);

        empresaTransporte.getListaPropietarios().add(propietario1);
        empresaTransporte.getListaPropietarios().add(propietario2);

        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga2);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga3);

        return empresaTransporte;
    }

    private static void encenderVehiculos() {
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.encender();

        VehiculoPasajero vehiculoPasajero = new VehiculoPasajero();
        vehiculoPasajero.encenderEletricamente();
    }

    private static void asociarVehiculo() {
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setPlaca("ABC123");
        vehiculoCarga.setModelo("2020");
        vehiculoCarga.setMarca("Volvo");
        vehiculoCarga.setColor("Blanco");
        vehiculoCarga.setCapacidadCarga(2000);
        vehiculoCarga.setNumeroEjes(4);


        Propietario asociado = new Propietario();
        asociado.setNombre("Carlos López");
        asociado.setNumeroIdentificacion("98765432");
        asociado.setEmail("carlos@example.com");
        asociado.setNumeroCelular("3109876543");

        asociado.setVehiculo(vehiculoCarga);
        System.out.println("Asociado creado: " + asociado.getNombre() + " con vehículo de placa: " + vehiculoCarga.getPlaca());
    }

    private static void calcultarTotalPasajeros() {
        VehiculoPasajero bus1 = new VehiculoPasajero();
        bus1.setNumeroMaximoPasajeros(40);

        VehiculoPasajero bus2 = new VehiculoPasajero();
        bus2.setNumeroMaximoPasajeros(30);

        List<VehiculoPasajero> vehiculos = new ArrayList<>();
        vehiculos.add(bus1);
        vehiculos.add(bus2);
        int[] viajesPorVehiculo = {5, 4};

        int totalPasajeros = calcularTotalPasajeros(vehiculos, viajesPorVehiculo);
        System.out.println("Total de pasajeros transportados en el día: " + totalPasajeros);
    }

    public static int calcularTotalPasajeros(List<VehiculoPasajero> vehiculos, int[] viajesPorVehiculo) {
        int totalPasajeros = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            totalPasajeros += vehiculos.get(i).getNumeroMaximoPasajeros() * viajesPorVehiculo[i];
        }
        return totalPasajeros;
    }
}