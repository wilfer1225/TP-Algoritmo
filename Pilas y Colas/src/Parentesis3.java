// Implementar un programa que determine si los delimitadores (, ), {, }, [, ] en una expresión aritmética (e.j. [(5+x)-(y+z)]) están equilibrados. En caso que la expresión aritmética se encuentre balanceada retornar true, en caso contrario retornar false.
// Entrada: {([()])} -> Salida: true
// Entrada: ({[])} -> Salida: false

import java.util.Stack;

public class Parentesis3 {

    public static boolean verificarDelimitadoresEquilibrados(String expresion) {
        Stack<Character> pila = new Stack<>();
        
        for (char caracter : expresion.toCharArray()) {
            if (esDelimitador(caracter)) {
                if (esDelimitadorAbierto(caracter)) {
                    pila.push(caracter);
                } else {
                    if (pila.isEmpty() || !esParDeDelimitador(pila.pop(), caracter)) {
                        return false;
                    }
                }
            }
        }
        
        return pila.isEmpty();
    }

    public static boolean esDelimitador(char caracter) {
        return caracter == '(' || caracter == ')' || caracter == '[' || caracter == ']' || caracter == '{' || caracter == '}';
    }

    public static boolean esDelimitadorAbierto(char caracter) {
        return caracter == '(' || caracter == '[' || caracter == '{';
    }

    public static boolean esParDeDelimitador(char abierto, char cerrado) {
        return (abierto == '(' && cerrado == ')') ||
               (abierto == '[' && cerrado == ']') ||
               (abierto == '{' && cerrado == '}');
    }

    public static void main(String[] args) {
        String expresion1 = "{([()])}";
        String expresion2 = "({[])}";

        System.out.println("Expresion 1: " + verificarDelimitadoresEquilibrados(expresion1));
        System.out.println("Expresion 2: " + verificarDelimitadoresEquilibrados(expresion2));
    }
}
