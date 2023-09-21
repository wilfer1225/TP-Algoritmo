import java.util.LinkedList;
import java.util.Queue;

public class Solitario7 {

    public static int jugarSolitario(Queue<Integer> mazo) {
        Queue<Integer> pila = new LinkedList<>();
        int movimientos = 0;

        while (!mazo.isEmpty()) {
            int naipe = mazo.poll();
            movimientos++;

            if (pila.isEmpty() || naipe < pila.peek()) {
                pila.offer(naipe);
            } else {
                mazo.offer(naipe); // Vuelve al final del primer mazo.
            }
        }

        return movimientos;
    }

    public static void main(String[] args) {
        Queue<Integer> mazo = new LinkedList<>();
        int n = 10; // Cambia n al número de naipes que tengas.

        // Llenar el mazo con naipes mezclados (por ejemplo, del 1 al n).
        for (int i = 1; i <= n; i++) {
            mazo.offer(i);
        }

        int movimientos = jugarSolitario(mazo);
        System.out.println("Cantidad de naipes apilados en el segundo mazo: " + movimientos);
    }
}
