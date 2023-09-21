import java.util.Stack;

public class SecuenciaApiladoDesapilado4 {

    public static void secuenciaA() {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i <= 9; i++) {
            pila.push(i);
        }
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }

    public static void secuenciaB() {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i <= 9; i++) {
            pila.push(i);
        }
        int[] ordenDeseado = {4, 6, 8, 7, 5, 3, 2, 9, 0, 1};
        for (int i : ordenDeseado) {
            if (!pila.isEmpty() && pila.peek() == i) {
                System.out.println(pila.pop());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Secuencia a:");
        secuenciaA();
        
        System.out.println("\nSecuencia b:");
        secuenciaB();
    }
}
