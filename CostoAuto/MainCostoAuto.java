import java.util.Scanner;

public class MainCostoAuto {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer el costo del automóvil
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el costo del automóvil:");
        double costoa = sc.nextDouble();
        
        // Crear un objeto de tipo CostoAuto con el costo inicial del automóvil
        CostoAuto costoAuto = new CostoAuto();
        costoAuto.setCostoa(costoa);
        
        // Calcular el pago del vendedor (pgv) y los impuestos
        costoAuto.setPgv(costoa);
        costoAuto.setImpuestos(costoa);
        
        // Calcular el costo final del automóvil
        costoAuto.setCostof(costoa);
        double costof = costoAuto.calcularCosto();
        
        // Imprimir el costo inicial del automóvil y su costo final
        System.out.println("El costo del automóvil es: " + costoa + " y su costo final sería: " + costof);
        
        // Imprimir la información del costo del automóvil utilizando el método toString
        System.out.println(costoAuto.toString());
        
        // Cerrar el Scanner
        sc.close();
    }
}