public class ConversorDolares {
    // Variable para almacenar la cantidad de pesos a convertir
    double pesos;

    // Constructor que recibe la cantidad de pesos a convertir
    public ConversorDolares(double pesos) {
        this.pesos = pesos;
    }

    // Método para convertir pesos a dólares
    public double aDolares() {
        return 0.059 * pesos;
    }

    // Método para obtener la cantidad de pesos
    public double getPesos() {
        return pesos;
    }

    // Método para establecer la cantidad de pesos
    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
}