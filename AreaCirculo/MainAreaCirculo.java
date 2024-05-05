import java.util.Scanner;

public class MainAreaCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo:");
        int radio = sc.nextInt();
    
        double area = AreaCirculo.calcularArea(radio);


        System.out.println("El área del círculo sería: " + area);
        sc.close();
    }
}