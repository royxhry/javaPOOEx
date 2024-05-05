public class AreaCirculo {
  public static double calcularArea(double radio) {
      if (radio <= 0) {
          return 0;
      } else {
          double area = Math.PI * radio * radio;
          return area;
      }
  }
}