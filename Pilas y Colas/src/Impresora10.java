import java.util.LinkedList;
import java.util.Queue;

class Impresora {
    private int capacidadMaximaTinta;
    private int tintaDisponible;
    private Queue<String> documentosEnCola;

    public Impresora(int capacidadMaximaTinta) {
        this.capacidadMaximaTinta = capacidadMaximaTinta;
        this.tintaDisponible = capacidadMaximaTinta;
        this.documentosEnCola = new LinkedList<>();
    }

    public void encolarDocumento(String nombreDocumento) {
        documentosEnCola.offer(nombreDocumento);
    }

    public void imprimirDocumentos() {
        if (documentosEnCola.isEmpty()) {
            System.out.println("No hay documentos encolados para imprimir.");
            return;
        }

        while (!documentosEnCola.isEmpty()) {
            String documento = documentosEnCola.poll();
            if (tintaDisponible >= 1) {
                System.out.println("Imprimiendo documento: " + documento);
                tintaDisponible -= 1;
            } else {
                System.out.println("No hay suficiente tinta para imprimir el documento: " + documento);
                break; // No hay suficiente tinta, se detiene la impresión.
            }
        }
    }

    public void cargarTinta() {
        tintaDisponible = capacidadMaximaTinta;
        System.out.println("Se ha cargado tinta en la impresora. Tinta disponible: " + tintaDisponible);
    }

    public int getTintaDisponible() {
        return tintaDisponible;
    }
}

public class Impresora10 {
    public static void main(String[] args) {
        Impresora impresora = new Impresora(10);

        impresora.encolarDocumento("Documento1");
        impresora.encolarDocumento("Documento2");

        impresora.imprimirDocumentos(); // Imprime los documentos en cola.
        System.out.println("Tinta disponible después de imprimir: " + impresora.getTintaDisponible());

        impresora.cargarTinta(); // Recarga la tinta.
        System.out.println("Tinta disponible después de cargar: " + impresora.getTintaDisponible());

        impresora.imprimirDocumentos(); // Intenta imprimir de nuevo.
    }
}
