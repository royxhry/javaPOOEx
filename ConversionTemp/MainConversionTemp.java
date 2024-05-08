import java.util.Scanner;

public class MainConversionTemp {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la temperatura en grados Celsius
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados Celsius:");
        double cel = sc.nextDouble();
        // Crear un objeto de tipo ConversionTemp con la temperatura ingresada
        ConversionTemp temp = new ConversionTemp(cel);
        // Convertir la temperatura a grados Fahrenheit
        double fahrenheit = temp.obFarenheit();
        // Imprimir la temperatura en grados Celsius y grados Fahrenheit
        System.out.println("Los grados en Celsius son: " + cel + "°C");
        System.out.println("Los grados en Fahrenheit son: " + fahrenheit + "°F");

        // Cerrar el Scanner
        sc.close();
    }
}