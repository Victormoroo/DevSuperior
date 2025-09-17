package entities;

public class Triangle {
  
  public double a;
  public double b;
  public double c;

  public double area() {
    double p = (a + a + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    // Tambem poderia ser assim:
    // double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    // return result;
  }
}
