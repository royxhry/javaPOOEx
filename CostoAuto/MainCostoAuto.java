import java.util.Scanner;

public class MainCostoAuto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el costo del automovil: ");
        double costoa = sc.nextDouble();
        CostoAuto costoAuto = new CostoAuto();
        costoAuto.setCostoa(costoa);
        costoAuto.setPgv(costoa);
        costoAuto.setImpuestos(costoa);
        costoAuto.setCostof(costoa);
        double costof = costoAuto.calcularCosto();
        System.out.println("El costo de el automovil es:" +costoa+" y su costo final seria "+costof+"pgv:");
        //agregue el toString para ver que se hayan ejecutado las operaciones de forma correcta
        System.out.println(costoAuto.toString());
        sc.close();
    }
}