import java.util.LinkedList;
import java.util.Queue;

public class InvertirCola5 {

    public static void invertirCola(Queue<Integer> cola) {
        if (cola.isEmpty()) {
            return; // Caso base: la cola está vacía, no hay nada que invertir.
        }

        int elemento = cola.poll(); // Quita el primer elemento de la cola.
        invertirCola(cola); // Llama recursivamente para invertir el resto de la cola.
        cola.offer(elemento); // Agrega el elemento al final de la cola invertida.
    }

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Llenar la cola con algunos elementos para demostración.
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        cola.offer(4);

        System.out.println("Cola original: " + cola);
        invertirCola(cola);
        System.out.println("Cola invertida: " + cola);
    }
}
