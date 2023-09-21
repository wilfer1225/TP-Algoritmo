import java.util.*;

class Alumno {
    private String nombre;
    private String materia;

    public Alumno(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class OrganizarAlumnosPorMateria8 {

    public static Map<String, Queue<Alumno>> organizarAlumnos(Queue<Alumno> alumnos) {
        Map<String, Queue<Alumno>> resultado = new HashMap<>();

        while (!alumnos.isEmpty()) {
            Alumno alumno = alumnos.poll();
            String materia = alumno.getMateria();

            // Si la materia no existe en el mapa, la agregamos con una nueva cola.
            resultado.putIfAbsent(materia, new LinkedList<>());

            // Agregamos al alumno a la cola correspondiente a su materia.
            resultado.get(materia).offer(alumno);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Queue<Alumno> colaAlumnos = new LinkedList<>();
        colaAlumnos.offer(new Alumno("Juan", "Matemáticas"));
        colaAlumnos.offer(new Alumno("María", "Historia"));
        colaAlumnos.offer(new Alumno("Pedro", "Matemáticas"));
        colaAlumnos.offer(new Alumno("Luisa", "Historia"));
        colaAlumnos.offer(new Alumno("Carlos", "Matemáticas"));
        colaAlumnos.offer(new Alumno("Ana", "Historia"));

        Map<String, Queue<Alumno>> resultado = organizarAlumnos(colaAlumnos);

        // Imprimir la lista de alumnos por materia.
        for (Map.Entry<String, Queue<Alumno>> entry : resultado.entrySet()) {
            String materia = entry.getKey();
            Queue<Alumno> listaAlumnos = entry.getValue();

            System.out.println("Materia: " + materia);
            while (!listaAlumnos.isEmpty()) {
                System.out.println(listaAlumnos.poll());
            }
            System.out.println();
        }
    }
}
