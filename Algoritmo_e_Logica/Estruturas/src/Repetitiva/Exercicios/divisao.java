package Repetitiva.Exercicios;

import java.util.Scanner;

public class divisao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos casos você vai digitar?: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Entre com o numerador: ");
      int numerador = sc.nextInt();
      System.out.print("Entre com o denominador: ");
      int denominador = sc.nextInt();

      if (denominador == 0) {
        System.out.println("DIVISÃO IMPOSSÍVEL");
      } else {
        double divisao = (double) numerador / denominador;
        System.out.printf("DIVISÃO = %.2f\n", divisao);
      }
    }

    sc.close();
  }
}
