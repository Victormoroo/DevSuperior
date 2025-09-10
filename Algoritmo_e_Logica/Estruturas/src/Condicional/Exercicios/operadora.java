package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class operadora {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de minutos: ");
    int minutos = sc.nextInt();

    double valor = 50.00;

    if (minutos > 100) {
      valor = valor + (minutos - 100) * 2.0;
    }
    System.out.printf("Valor a pagar: R$%.2f", valor);

    sc.close();
  }
}
