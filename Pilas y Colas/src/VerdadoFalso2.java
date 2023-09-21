//Esto es mejor pensarlo 
import java.util.Scanner;
import java.util.Stack;

public class VerdadoFalso2 {
    public static void main(String[] args) {
        System.out.println("Este programa ejecuta un código y te pide que elijas la posible salida correcta.");
        System.out.println("El código es el siguiente:");

        System.out.println("N = 3;");
        System.out.println("Pila = Pila(MAX_INT);");
        System.out.println("for (i = 1; i <= N; i++) {");
        System.out.println("    if (TEST(i))");
        System.out.println("        print(i);");
        System.out.println("    else");
        System.out.println("        pila.push(i);");
        System.out.println("}");
        System.out.println("while (!pila.isEmpty) {");
        System.out.println("    el = pila.pop();");
        System.out.println("    print(el);");
        System.out.println("}");

        int N = 3;
        Stack<Integer> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        char[] opciones = {'a', 'b', 'c', 'd', 'e', 'f'};
        String[] respuestas = {"1 2 3", "1 3 2", "2 1 3", "3 1 2", "2 3 1", "3 2 1"};

        System.out.println("\n¿Cuál es la posible salida del código? Seleccione la letra correspondiente:");

        for (int i = 0; i < opciones.length; i++) {
            System.out.println(opciones[i] + ") " + respuestas[i]);
        }

        char respuestaUsuario = scanner.next().charAt(0);

        if (respuestaUsuario >= 'a' && respuestaUsuario <= 'f') {
            int indexRespuesta = respuestaUsuario - 'a';
            String respuestaCorrecta = respuestas[indexRespuesta];
            System.out.println("\nEl código se está ejecutando...\n");

            // Ahora ejecutamos el código
            for (int i = 1; i <= N; i++) {
                if (TEST(i)) {
                    System.out.print(i + " ");
                } else {
                    pila.push(i);
                }
            }

            System.out.print("Resultado esperado: " + respuestaCorrecta);
        } else {
            System.out.println("Opción no válida");
        }

        scanner.close();
    }

    // Función TEST arbitraria que devuelve true o false
    public static boolean TEST(int i) {
        // Implementa aquí la lógica de TEST según tus necesidades
        // Por ejemplo, puedes retornar true para valores pares y false para impares
        return i % 2 == 0;
    }
}
