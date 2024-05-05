import java.util.Scanner;

public class MainSecondsByDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("de cuantos dias quieres obtener los segundos? ");
        int days = sc.nextInt();
        SecondsByDay sd = new SecondsByDay(days);
        int seconds = sd.obSeconds();
        System.out.println("La cantidad de segundos que tiene "+days+" dias es:"+seconds);
        sc.close();
    }
}