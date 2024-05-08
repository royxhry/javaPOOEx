
public class AreaTriangulo {
    // Método para calcular el área de un triángulo
    public static double areaTriangulo(double altura, double base){
        // Verificar si la base o la altura son no positivas
        if (base <= 0 || altura <= 0) {
            return 0; // Retornar 0 si alguno de los valores es no positivo
        } else {
            // Calcular el área del triángulo
            double area = (base * altura) / 2;
            return area; // Retornar el área calculada
        }
    }
}