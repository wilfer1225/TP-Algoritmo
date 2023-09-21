import java.util.LinkedList;
import java.util.Queue;

public class ColaConPrioridad6 {

    private Queue<Integer> colaPrioridad;
    private Queue<Integer> colaComun;

    public ColaConPrioridad6() {
        colaPrioridad = new LinkedList<>();
        colaComun = new LinkedList<>();
    }

    public void encolarConPrioridad(int elemento) {
        colaPrioridad.offer(elemento);
    }

    public void encolarComun(int elemento) {
        colaComun.offer(elemento);
    }

    public int desencolar() {
        if (!colaPrioridad.isEmpty()) {
            return colaPrioridad.poll(); // Desencola un elemento con prioridad si hay alguno.
        } else if (!colaComun.isEmpty()) {
            return colaComun.poll(); // Desencola un elemento común si no hay elementos con prioridad.
        } else {
            throw new IllegalStateException("La cola está vacía.");
        }
    }

    public static void main(String[] args) {
        ColaConPrioridad6 cola = new ColaConPrioridad6();

        // Encolar elementos con prioridad.
        cola.encolarConPrioridad(10);
        cola.encolarConPrioridad(20);

        // Encolar elementos comunes.
        cola.encolarComun(1);
        cola.encolarComun(2);
        cola.encolarComun(3);

        // Desencolar debe priorizar elementos con prioridad.
        System.out.println("Desencolando: " + cola.desencolar()); // 10
        System.out.println("Desencolando: " + cola.desencolar()); // 20

        // Luego, desencola elementos comunes.
        System.out.println("Desencolando: " + cola.desencolar()); // 1
        System.out.println("Desencolando: " + cola.desencolar()); // 2
        System.out.println("Desencolando: " + cola.desencolar()); // 3
    }
}
