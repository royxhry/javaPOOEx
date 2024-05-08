import java.util.Scanner;

public class MainAreaCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo:");
        double radio = sc.nextDouble(); // Usar double en lugar de int para el radio
    
        double area = AreaCirculo.calcularArea(radio); // Llamar al método para calcular el área

        // Imprimir el resultado
        System.out.println("El área del círculo es: " + area);
        
        // Cerrar el Scanner
        sc.close();
    }
}