import java.util.Scanner;

public class MainAreaTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la base del triángulo
        System.out.println("Ingresa la base del triángulo: ");
        double base = sc.nextDouble();

        // Solicitar al usuario la altura del triángulo
        System.out.println("Ingresa la altura del triángulo: ");
        double altura = sc.nextDouble();

        // Calcular el área del triángulo llamando al método estático de la clase AreaTriangulo
        double area = AreaTriangulo.areaTriangulo(base, altura);

        // Mostrar el resultado del área del triángulo
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el Scanner
        sc.close();
    }
}