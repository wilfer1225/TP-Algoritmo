import java.util.Scanner;

public class Autenticacion7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int intentos = 0;
        boolean loginExitoso = false;

        while (intentos < 3 && !loginExitoso) {
            System.out.print("Nombre de usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contraseña = scanner.nextLine();

            if (Login(usuario, contraseña, intentos)) {
                System.out.println("¡Login exitoso!");
                loginExitoso = true;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Intento #" + (intentos + 1) + "/3\n");
                intentos++;
            }
        }

        if (!loginExitoso) {
            System.out.println("Has excedido el número máximo de intentos. Cerrando programa.");
        }

        scanner.close();
    }

    // Subrutina para realizar el login
    public static boolean Login(String usuario, String contraseña, int intentos) {
        // Comprobar si el nombre de usuario y la contraseña son correctos
        if (usuario.equals("usuario1") && contraseña.equals("asdasd")) {
            return true;
        } else {
            if (intentos < 2) {
                System.out.println("Intenta de nuevo...");
            }
            return false;
        }
    }
}
