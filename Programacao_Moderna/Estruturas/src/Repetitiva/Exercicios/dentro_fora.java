package Repetitiva.Exercicios;

import java.util.Scanner;

public class dentro_fora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar?: ");
    int x = sc.nextInt();

    int dentro = 0;
    int fora = 0;

    for (int i = 1; i <= x; i++) {
      System.out.print("Digite um número inteiro: ");
      int num = sc.nextInt();

      if (num < 10 || num > 20) {
        fora++;
      } else {
        dentro++;
      }
    }

    System.out.printf("%d DENTRO\n%d FORA", dentro, fora);

    sc.close();
  }
}
