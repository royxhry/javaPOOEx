import java.util.Scanner;

public class MainAreaTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la base del triangulo: ");
            double base = sc.nextDouble();
        System.out.println("Ingresa la altura del triangulo: ");
            double altura = sc.nextDouble();

            double area = AreaTriangulo.areaTriangulo(base,altura);

        System.out.println("El area del trinagulo es:"+area);

        sc.close();
    }
}