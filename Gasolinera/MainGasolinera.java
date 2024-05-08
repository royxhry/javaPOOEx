import java.util.Scanner;

public class MainGasolinera {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la cantidad de galones necesarios
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa cuántos galones necesitas:");
        double galones = sc.nextDouble();
        
        // Crear un objeto de tipo Gasolinera con la cantidad de galones ingresada
        Gasolinera gs = new Gasolinera(galones);
        // Calcular la cantidad de litros equivalente a los galones ingresados
        double litros = gs.Alitros();
        // Calcular el precio total
        double precio = gs.calcularPrecio();
        
        // Imprimir el resultado
        System.out.printf("%.2f galones equivalen a %.2f litros, por lo tanto, serían $%.2f\n", galones, litros, precio);
        
        // Cerrar el Scanner
        sc.close();
    }
}