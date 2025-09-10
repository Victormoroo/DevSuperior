package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dardo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double maior;

    System.out.println("Digite as 3 distâncias:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    if (a >= b && a >= c) {
      maior = a;
    }
    else if (b >= c) {
      maior = b;
    }
    else {
      maior = c;
    }

    System.out.printf("MAIOR DISTÂNCIA = %.2f", maior);

    sc.close();
  }
}
