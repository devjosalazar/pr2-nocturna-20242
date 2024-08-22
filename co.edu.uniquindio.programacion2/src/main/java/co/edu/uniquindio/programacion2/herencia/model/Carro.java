package co.edu.uniquindio.programacion2.herencia.model;

public class Carro extends Vehiculo{

    private String placa;

    public Carro(){

    }

    public Carro(String placa){
        this.placa = placa;
    }


    @Override
    public void encender() {
        System.out.println("Encender carro");
    }

    public String encender(int codigo) {
        System.out.println("Encender carro con codigo: "+codigo);
        return "";
    }

    public int encender(String llave) {
        System.out.println("Encender carro con llave: "+llave);
        return 0;
    }
}
