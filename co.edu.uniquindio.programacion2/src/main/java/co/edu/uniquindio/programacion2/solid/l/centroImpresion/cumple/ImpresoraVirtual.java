package co.edu.uniquindio.programacion2.solid.l.centroImpresion.cumple;

class ImpresoraVirtual implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Simulando la impresión de: " + documento);
    }
}
