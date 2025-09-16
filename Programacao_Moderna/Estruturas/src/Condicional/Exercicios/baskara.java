package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class baskara {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double a, b, c, x1, x2;

    System.out.print("Coeficiente a: ");
    a = sc.nextDouble();
    System.out.print("Coeficiente b: ");
    b = sc.nextDouble();
    System.out.print("Coeficiente c: ");
    c = sc.nextDouble();

    double delta = Math.pow(b, 2.0) - 4 * a * c;

    x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
    x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

    if (delta > 0) {
      System.out.printf("X1 = %.4f%n", x1);
      System.out.printf("X2 = %.4f", x2);
    }
    else {
      System.out.println("Esta equação não possui raízes reais.");
    }

    sc.close();
  }
}
