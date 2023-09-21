import java.util.Scanner;

public class Fracciones12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Sumar dos fracciones");
            System.out.println("2. Restar dos fracciones");
            System.out.println("3. Multiplicar dos fracciones");
            System.out.println("4. Dividir dos fracciones");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Fraccion fraccion1 = LeerFraccion();
                    Fraccion fraccion2 = LeerFraccion();
                    Fraccion suma = SumarFracciones(fraccion1, fraccion2);
                    System.out.println("Resultado de la suma: ");
                    EscribirFraccion(suma);
                    break;

                case 2:
                    Fraccion fraccion3 = LeerFraccion();
                    Fraccion fraccion4 = LeerFraccion();
                    Fraccion resta = RestarFracciones(fraccion3, fraccion4);
                    System.out.println("Resultado de la resta: ");
                    EscribirFraccion(resta);
                    break;

                case 3:
                    Fraccion fraccion5 = LeerFraccion();
                    Fraccion fraccion6 = LeerFraccion();
                    Fraccion multiplicacion = MultiplicarFracciones(fraccion5, fraccion6);
                    System.out.println("Resultado de la multiplicación: ");
                    EscribirFraccion(multiplicacion);
                    break;

                case 4:
                    Fraccion fraccion7 = LeerFraccion();
                    Fraccion fraccion8 = LeerFraccion();
                    Fraccion division = DividirFracciones(fraccion7, fraccion8);
                    System.out.println("Resultado de la división: ");
                    EscribirFraccion(division);
                    break;

                case 5:
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.\n");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Clase para representar una fracción
    static class Fraccion {
        int numerador;
        int denominador;
    }

    // Función para leer una fracción y simplificarla
    public static Fraccion LeerFraccion() {
        Scanner scanner = new Scanner(System.in);
        Fraccion fraccion = new Fraccion();

        System.out.print("Ingresa el numerador: ");
        fraccion.numerador = scanner.nextInt();

        do {
            System.out.print("Ingresa el denominador (debe ser distinto de 0): ");
            fraccion.denominador = scanner.nextInt();
        } while (fraccion.denominador == 0);

        SimplificarFraccion(fraccion);

        return fraccion;
    }

    // Función para escribir una fracción
    public static void EscribirFraccion(Fraccion fraccion) {
        System.out.print(fraccion.numerador);
        if (fraccion.denominador != 1) {
            System.out.print("/" + fraccion.denominador);
        }
        System.out.println();
    }

    // Función para calcular el máximo común divisor
    public static int CalcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Función para simplificar una fracción
    public static void SimplificarFraccion(Fraccion fraccion) {
        int mcd = CalcularMCD(fraccion.numerador, fraccion.denominador);
        fraccion.numerador /= mcd;
        fraccion.denominador /= mcd;
    }

    // Función para sumar dos fracciones
    public static Fraccion SumarFracciones(Fraccion f1, Fraccion f2) {
        Fraccion resultado = new Fraccion();
        resultado.numerador = f1.numerador * f2.denominador + f1.denominador * f2.numerador;
        resultado.denominador = f1.denominador * f2.denominador;
        SimplificarFraccion(resultado);
        return resultado;
    }

    // Función para restar dos fracciones
    public static Fraccion RestarFracciones(Fraccion f1, Fraccion f2) {
        Fraccion resultado = new Fraccion();
        resultado.numerador = f1.numerador * f2.denominador - f1.denominador * f2.numerador;
        resultado.denominador = f1.denominador * f2.denominador;
        SimplificarFraccion(resultado);
        return resultado;
    }

    // Función para multiplicar dos fracciones
    public static Fraccion MultiplicarFracciones(Fraccion f1, Fraccion f2) {
        Fraccion resultado = new Fraccion();
        resultado.numerador = f1.numerador * f2.numerador;
        resultado.denominador = f1.denominador * f2.denominador;
        SimplificarFraccion(resultado);
        return resultado;
    }

    // Función para dividir dos fracciones
    public static Fraccion DividirFracciones(Fraccion f1, Fraccion f2) {
        Fraccion resultado = new Fraccion();
        resultado.numerador = f1.numerador * f2.denominador;
        resultado.denominador = f1.denominador * f2.numerador;
        SimplificarFraccion(resultado);
        return resultado;
    }
}
