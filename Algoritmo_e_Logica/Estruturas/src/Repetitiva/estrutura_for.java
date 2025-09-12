package Repetitiva;

import java.util.Scanner;

public class estrutura_for {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos números você quer digitar?: ");
    int num = sc.nextInt();

    int soma = 0;

    for (int i = 0; i < num; i++) {
      System.out.printf("Digite o %dº numero: ", i + 1);
      int aux = sc.nextInt();
      soma += aux;
    }

    System.out.println("RESULTADO = " + soma);
  }
}
