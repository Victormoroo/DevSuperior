package Sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class medidas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double A, B, C;

    System.out.print("Digite a medida de A: ");
    A = sc.nextDouble();
    System.out.print("Digite a medida de B: ");
    B = sc.nextDouble();
    System.out.print("Digite a medida de C: ");
    C = sc.nextDouble();

    System.out.printf("AREA DO QUADRADO = %.4f%n", A * A);
    System.out.printf("AREA DO TRIÂNGULO = %.4f%n", (A * B) / 2);
    System.out.printf("AREA DO TRAPEZIO = %.4f", ((A + B) * C) / 2);

    sc.close();
  }
}
