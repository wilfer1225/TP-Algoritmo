import java.util.Scanner;

public class MaximoMinimo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea comparar: ");
        int cantidadNumeros = scanner.nextInt();

        if (cantidadNumeros <= 0) {
            System.out.println("Debe ingresar al menos un número.");
            return;
        }

        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double[] resultado = calcularMaxMin(numeros);
        
        System.out.println("El valor máximo es: " + resultado[0]);
        System.out.println("El valor mínimo es: " + resultado[1]);

        scanner.close();
    }

    // Función para calcular el valor máximo y mínimo
    public static double[] calcularMaxMin(double[] numeros) {
        if (numeros.length == 0) {
            return new double[]{0.0, 0.0};
        }

        double maximo = numeros[0];
        double minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return new double[]{maximo, minimo};
    }
}
