import java.util.Scanner;

public class MainSecondsByDay {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la cantidad de días
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De cuántos días quieres obtener los segundos?");
        int days = sc.nextInt();
        
        // Crear un objeto de tipo SecondsByDay con la cantidad de días ingresada
        SecondsByDay sd = new SecondsByDay(days);
        // Calcular la cantidad de segundos
        int seconds = sd.obSeconds();
        
        // Imprimir el resultado
        System.out.println("La cantidad de segundos que tiene " + days + " días es: " + seconds);
        
        // Cerrar el Scanner
        sc.close();
    }
}