/* Problema 1:
Escribir una función Reemplazar que tenga como argumentos una pila con tipo de elemento enteros y dos valores, nuevo y viejo, de forma que, si el segundo valor aparece en algún lugar de la pila, sea reemplazado por el primero.
 */
import java.util.Stack;

public class ReemplazarPila1 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(2);
        pila.push(6);
        pila.push(5);
        pila.push(2);

        int nuevo = 45;
        int viejo = 2;
        
        System.out.println("Pila original: " + pila);
        reemplazar(pila, nuevo, viejo);
        System.out.println("Pila después de reemplazar: " + pila);
    }
    
    public static void reemplazar(Stack<Integer> pila, int nuevo, int viejo) {
        Stack<Integer> aux = new Stack<>();
        
        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            if (elemento == viejo) {
                aux.push(nuevo);
            } else {
                aux.push(elemento);
            }
        }
        
        // Volvemos a apilar los elementos en la pila original
        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
    }
}