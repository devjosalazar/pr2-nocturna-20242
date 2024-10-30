package co.edu.uniquindio.programacion2.patrones_estructurales.proxy.ejemploImagen;

// Uso del patrón Proxy - Actúa como intermediario para controlar el acceso a otro objeto.
public class MainProxy {

    //ProxyImage actúa como intermediario y
    // difiere la creación de RealImage
    // hasta que realmente se necesita mostrar la imagen.
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        System.out.println("Image will be displayed only when needed.");
        image.display(); // Carga y muestra la imagen
        image.display(); // Solo muestra la imagen sin recargar
    }
}