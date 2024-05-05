import java.util.Scanner;

public class MainConversorDolares{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa cuantos pesos quieres convertir a dolares:");
        double pesos = sc.nextDouble();
        ConversorDolares cd = new ConversorDolares(pesos);
        double dolares = cd.aDolares();
        System.out.println("La cantidad de "+pesos+" pesos equivale a: "+dolares+" dolares");
        sc.close();

    }
}