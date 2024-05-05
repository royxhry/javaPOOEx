import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String name = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int age = sc.nextInt();
        System.out.println("Ingrese la calificación del estudiante:");
        int score = sc.nextInt();

        Estudiante estudiante = new Estudiante(name, age, score);
        estudiante.imprimirDatos();

        sc.close();
    }
}