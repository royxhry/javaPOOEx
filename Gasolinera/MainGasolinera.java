import java.util.Scanner;

public class MainGasolinera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa cuántos galones necesitas:");
        double galones = sc.nextDouble();
        Gasolinera gs = new Gasolinera(galones);
        double litros = gs.Alitros();
        double precio = gs.calcularPrecio();
        System.out.printf("%.2f galones equivalen a %.2f litros, por lo tanto, serían $%.2f\n", galones, litros, precio);
        sc.close();
    }
}