public class SecondsByDay {
    // Variable para almacenar la cantidad de días
    private int days;

    // Constructor que recibe la cantidad de días
    public SecondsByDay(int days){
        this.days = days;
    }

    // Método para calcular la cantidad de segundos en base a los días
    public int obSeconds(){
        return days * 86400; // 86400 segundos en un día
    }
}