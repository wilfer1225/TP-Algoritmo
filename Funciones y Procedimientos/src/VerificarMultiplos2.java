import java.util.Scanner;

public class VerificarMultiplos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese los dos números enteros
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        // Verificar si alguno de los números es múltiplo del otro
        if (EsMultiplo(numero1, numero2)) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else if (EsMultiplo(numero2, numero1)) {
            System.out.println(numero2 + " es múltiplo de " + numero1);
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro.");
        }
        
        scanner.close();
    }

    // Función para verificar si un número es múltiplo de otro
    public static boolean EsMultiplo(int numero1, int numero2) {
        // Un número es múltiplo del otro si el residuo de la división es cero
        return numero1 % numero2 == 0;
    }
}
