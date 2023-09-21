import java.util.Scanner;

public class Circunferencia6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double[] resultados = calcularAreaYPerimetro(radio);

        double area = resultados[0];
        double perimetro = resultados[1];

        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Perímetro de la circunferencia: " + perimetro);

        scanner.close();
    }

    // Función para calcular el área y el perímetro de una circunferencia
    public static double[] calcularAreaYPerimetro(double radio) {
        double pi = Math.PI;
        double area = pi * Math.pow(radio, 2);
        double perimetro = 2 * pi * radio;

        // Devolver el área y el perímetro en un arreglo
        return new double[]{area, perimetro};
    }
}
