import java.util.Scanner;

public class DiaJuliano10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("Calculadora de Día Juliano");
        System.out.print("Ingresa el día: ");
        dia = scanner.nextInt();
        System.out.print("Ingresa el mes: ");
        mes = scanner.nextInt();
        System.out.print("Ingresa el año: ");
        anio = scanner.nextInt();

        int diaJuliano = Calcular_Dia_Juliano(dia, mes, anio);
        System.out.println("El día juliano correspondiente a la fecha ingresada es: " + diaJuliano);

        scanner.close();
    }

    // Subrutina para leer una fecha por teclado
    public static void LeerFecha(int[] fecha) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el día: ");
        fecha[0] = scanner.nextInt();
        System.out.print("Ingresa el mes: ");
        fecha[1] = scanner.nextInt();
        System.out.print("Ingresa el año: ");
        fecha[2] = scanner.nextInt();
    }

    // Subrutina para obtener los días de un mes en un año dado
    public static int DiasDelMes(int mes, int anio) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Si el mes es febrero y el año es bisiesto, retorna 29 días
        if (mes == 2 && EsBisiesto(anio)) {
            return 29;
        } else {
            return diasPorMes[mes];
        }
    }

    // Subrutina para verificar si un año es bisiesto
    public static boolean EsBisiesto(int anio) {
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }

    // Subrutina para calcular el día juliano de una fecha
    public static int Calcular_Dia_Juliano(int dia, int mes, int anio) {
        int diaJuliano = dia;

        for (int i = 1; i < mes; i++) {
            diaJuliano += DiasDelMes(i, anio);
        }

        return diaJuliano;
    }
}
