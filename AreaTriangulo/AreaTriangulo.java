public class AreaTriangulo {
    public static double areaTriangulo(double altura, double base){
        if (base <= 0 || altura <= 0) {
            return 0;
        } else {
            double area = (base * altura) / 2;
            return area;
    }
}
}