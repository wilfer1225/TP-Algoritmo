import java.util.Scanner;

public class ConversorTiempo9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Convertir a segundos");
            System.out.println("2. Convertir a horas, minutos y segundos");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad de horas: ");
                    int horas = scanner.nextInt();
                    System.out.print("Ingresa la cantidad de minutos: ");
                    int minutos = scanner.nextInt();
                    System.out.print("Ingresa la cantidad de segundos: ");
                    int segundos = scanner.nextInt();
                    int tiempoEnSegundos = calcularTiempoEnSegundos(horas, minutos, segundos);
                    System.out.println("El tiempo ingresado es equivalente a " + tiempoEnSegundos + " segundos.\n");
                    break;

                case 2:
                    System.out.print("Ingresa la cantidad de segundos: ");
                    int segundosTotal = scanner.nextInt();
                    int[] tiempo = calcularTiempoEnHorasMinutosSegundos(segundosTotal);
                    System.out.println("El tiempo ingresado es equivalente a " + tiempo[0] + " horas, " + tiempo[1] + " minutos y " + tiempo[2] + " segundos.\n");
                    break;

                case 3:
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.\n");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Función para calcular la cantidad de segundos en un tiempo dado en horas, minutos y segundos.
    public static int calcularTiempoEnSegundos(int horas, int minutos, int segundos) {
        return (horas * 3600) + (minutos * 60) + segundos;
    }

    // Función para calcular la cantidad de horas, minutos y segundos de un tiempo dado en segundos.
    public static int[] calcularTiempoEnHorasMinutosSegundos(int segundosTotal) {
        int[] tiempo = new int[3];
        tiempo[0] = segundosTotal / 3600;  // Horas
        tiempo[1] = (segundosTotal % 3600) / 60;  // Minutos
        tiempo[2] = segundosTotal % 60;  // Segundos
        return tiempo;
    }
}
