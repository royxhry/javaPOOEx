public class AreaCirculo {
    // Método estático para calcular el área de un círculo
    public static double calcularArea(double radio) {
        if (radio <= 0) {
            return 0; // Retorna 0 si el radio es no positivo
        } else {
            return Math.PI * radio * radio; // Calcula y retorna el área del círculo
        }
    }
}