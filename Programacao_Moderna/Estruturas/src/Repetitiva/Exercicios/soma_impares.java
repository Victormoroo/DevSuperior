package Repetitiva.Exercicios;

import java.util.Scanner;

public class soma_impares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois números:");
    int x = sc.nextInt();
    int y = sc.nextInt();

    if (x > y) {
      int aux = x;
      x = y;
      y = aux;
    }

    int soma = 0;
    for (int i = x + 1; i < y; i++) {
      if (i % 2 != 0) {
        soma += i;
      }
    }

    System.out.printf("SOMA DOS IMPARES = %d\n", soma);

    sc.close();
  }
}
