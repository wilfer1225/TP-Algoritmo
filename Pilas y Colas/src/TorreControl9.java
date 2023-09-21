import java.util.LinkedList;
import java.util.Queue;

class TorreControlAeropuerto {
    private Queue<String> vuelosAterrizar;
    private Queue<String> vuelosDespegar;

    public TorreControlAeropuerto() {
        vuelosAterrizar = new LinkedList<>();
        vuelosDespegar = new LinkedList<>();
    }

    public void agregarVueloAterrizar(String vuelo) {
        vuelosAterrizar.offer(vuelo);
    }

    public void agregarVueloDespegar(String vuelo) {
        vuelosDespegar.offer(vuelo);
    }

    public void aterrizarVuelos() {
        while (!vuelosAterrizar.isEmpty()) {
            String vuelo = vuelosAterrizar.poll();
            System.out.println("El vuelo " + vuelo + " aterrizó con éxito.");
        }
    }

    public void despegarVuelos() {
        while (!vuelosDespegar.isEmpty()) {
            String vuelo = vuelosDespegar.poll();
            System.out.println("El vuelo " + vuelo + " despegó con éxito.");
        }
    }

    public void estadoTorreControl() {
        System.out.println("Vuelos esperando para aterrizar: " + vuelosAterrizar);
        System.out.println("Vuelos esperando para despegar: " + vuelosDespegar);
    }
}

public class TorreControl9 {
    public static void main(String[] args) {
        TorreControlAeropuerto torreControl = new TorreControlAeropuerto();

        torreControl.agregarVueloAterrizar("AR156");
        torreControl.agregarVueloAterrizar("AR32");
        torreControl.agregarVueloDespegar("KLM1267");

        torreControl.estadoTorreControl();
        torreControl.aterrizarVuelos();
        torreControl.despegarVuelos();
        torreControl.estadoTorreControl();
    }
}
