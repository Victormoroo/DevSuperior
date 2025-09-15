package Repetitiva.Exercicios;

import java.util.Scanner;

public class par_impar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar?: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print("Digite um número: ");
      int num = sc.nextInt();

      if (num == 0) {
        System.out.println("NULO");
      } else if (num > 0) {
        if (num % 2 == 0) {
          System.out.println("PAR POSITIVO");
        } else {
          System.out.println("ÍMPAR POSITIVO");
        }
      } else {
        if (num % 2 == 0) {
          System.out.println("PAR NEGATIVO");
        } else {
          System.out.println("ÍMPAR NEGATIVO");
        }
      }
    }

    sc.close();
  }
}
