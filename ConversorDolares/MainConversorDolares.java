import java.util.Scanner;

public class MainConversorDolares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la cantidad de pesos a convertir
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa cuántos pesos quieres convertir a dólares:");
        double pesos = sc.nextDouble();
        // Crear un objeto de tipo ConversorDolares con la cantidad de pesos ingresada
        ConversorDolares cd = new ConversorDolares(pesos);
        // Convertir la cantidad de pesos a dólares
        double dolares = cd.aDolares();
        // Imprimir la cantidad de pesos y su equivalente en dólares
        System.out.println("La cantidad de " + pesos + " pesos equivale a: " + dolares + " dólares");
        
        // Cerrar el Scanner
        sc.close();
    }
}