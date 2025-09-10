package Sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double base, altura;

    System.out.print("Digite a base do retangulo: ");
    base = sc.nextDouble();
    System.out.print("Digite a altura do retangulo: ");
    altura = sc.nextDouble();

    double area = base * altura;
    System.out.printf("Area do retangulo = %.4f%n", area);
    System.out.printf("Perimetro do retangulo = %.4f%n", 2 * (base + altura));
    System.out.printf("Diagonal do retangulo = %.4f%n", Math.sqrt(base * base + altura * altura));

    sc.close();
  }
}
