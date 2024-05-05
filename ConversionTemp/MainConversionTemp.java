import java.util.Scanner;
public class MainConversionTemp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados celsius:");
        double cel = sc.nextDouble();
        ConversionTemp temp =new ConversionTemp(cel);
        double farenheit = temp.obFarenheit();
        System.out.println("Los grados en celsius son:"+cel+"°C");
        System.out.println("Los grados en farenheit son:"+farenheit+"F");

        sc.close();
    }


    
}
