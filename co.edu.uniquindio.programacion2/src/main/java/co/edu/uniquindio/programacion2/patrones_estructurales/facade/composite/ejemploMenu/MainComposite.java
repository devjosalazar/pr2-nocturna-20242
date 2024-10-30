package co.edu.uniquindio.programacion2.patrones_estructurales.composite.ejemploMenu;

// Uso del patrón Composite - Permite tratar objetos individuales y compuestos de la misma manera.
public class MainComposite {

//    El Menu puede contener tanto MenuItem (objetos hoja)
//    como otros Menu (compuestos). Este patrón permite tratar ambos de manera uniforme.
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main Menu");
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");

        Menu subMenu = new Menu("Sub Menu");
        subMenu.add(new MenuItem("Sub Item 1"));

        mainMenu.add(item1);
        mainMenu.add(item2);
        mainMenu.add(subMenu);

        mainMenu.show();
    }
}