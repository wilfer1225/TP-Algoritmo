import java.util.Scanner;

public class TemperaturaMedia3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de días a calcular la temperatura media: ");
        int numeroDias = scanner.nextInt();
        
        for (int i = 1; i <= numeroDias; i++) {
            System.out.print("Ingresa la temperatura máxima del día " + i + ": ");
            double temperaturaMaxima = scanner.nextDouble();

            System.out.print("Ingresa la temperatura mínima del día " + i + ": ");
            double temperaturaMinima = scanner.nextDouble();

            double temperaturaMedia = calcularTemperaturaMedia(temperaturaMaxima, temperaturaMinima);

            System.out.println("La temperatura media del día " + i + " es: " + temperaturaMedia + " grados Celsius\n");
        }

        scanner.close();
    }

    // Función para calcular la temperatura media
    public static double calcularTemperaturaMedia(double temperaturaMaxima, double temperaturaMinima) {
        return (temperaturaMaxima + temperaturaMinima) / 2.0;
    }
}
