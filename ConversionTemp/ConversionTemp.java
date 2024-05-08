public class ConversionTemp {
    // Variable para almacenar la temperatura en grados Celsius
    private double cel;

    // Constructor que recibe la temperatura en grados Celsius
    public ConversionTemp(double cel) {
        this.cel = cel;
    }

    // Método para convertir grados Celsius a Fahrenheit
    public double obFarenheit() {
        return (9 * cel + 160) / 5;
    }

    // Método para obtener la temperatura en grados Celsius
    public double getCel() {
        return cel;
    }

    // Método para establecer la temperatura en grados Celsius
    public void setCel(double cel) {
        this.cel = cel;
    }
}
