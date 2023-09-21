import java.util.LinkedList;
import java.util.Queue;

class Banco {
    private Queue<String> grupoPar;
    private Queue<String> grupoImpar;

    public Banco() {
        grupoPar = new LinkedList<>();
        grupoImpar = new LinkedList<>();
    }

    public void ingresarCliente(String dni) {
        int ultimoDigito = Integer.parseInt(dni.substring(dni.length() - 1));
        if (ultimoDigito % 2 == 0) {
            grupoPar.offer(dni);
        } else {
            grupoImpar.offer(dni);
        }
    }

    public void mostrarGrupos() {
        System.out.println("Grupo 1 (DNI terminado en número par):");
        while (!grupoPar.isEmpty()) {
            System.out.println(grupoPar.poll());
        }

        System.out.println("\nGrupo 2 (DNI terminado en número impar):");
        while (!grupoImpar.isEmpty()) {
            System.out.println(grupoImpar.poll());
        }
    }
}

public class Banco11 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Simulación de ingreso de clientes con DNI.
        banco.ingresarCliente("12345678");
        banco.ingresarCliente("87654321");
        banco.ingresarCliente("98765432");
        banco.ingresarCliente("23456789");

        // Mostrar grupos en pantalla.
        banco.mostrarGrupos();
    }
}
