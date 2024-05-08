import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre del estudiante
        System.out.println("Ingrese el nombre del estudiante:");
        String name = sc.nextLine();
        // Solicitar al usuario que ingrese la edad del estudiante
        System.out.println("Ingrese la edad del estudiante:");
        int age = sc.nextInt();
        // Solicitar al usuario que ingrese la calificación del estudiante
        System.out.println("Ingrese la calificación del estudiante:");
        int score = sc.nextInt();

        // Crear un objeto de tipo Estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(name, age, score);
        // Imprimir los datos del estudiante
        estudiante.imprimirDatos();

        // Cerrar el Scanner
        sc.close();
    }
}
