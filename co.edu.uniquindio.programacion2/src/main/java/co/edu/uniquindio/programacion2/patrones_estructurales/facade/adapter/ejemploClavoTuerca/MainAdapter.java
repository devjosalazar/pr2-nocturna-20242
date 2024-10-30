package co.edu.uniquindio.programacion2.patrones_estructurales.adapter.ejemploClavoTuerca;

public class MainAdapter {

    // Uso del adaptador - Adapta interfaces incompatibles para que puedan trabajar juntas.
    public static void main(String[] args) {
        Tuerca tuerca = new Tuerca(5);
        Clavo clavo = new Clavo(5);

        ClavoAdapter adapter = new ClavoAdapter(clavo);

        if (tuerca.enrroscar(adapter)){
            System.out.println("El clavo encaja en la tuerca");
        }else {
            System.out.println("No encaja");
        }
    }
}
