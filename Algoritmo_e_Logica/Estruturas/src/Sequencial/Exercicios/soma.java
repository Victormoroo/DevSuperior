package Sequencial.Exercicios;

import java.util.Scanner;

public class soma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x, y, soma;

    System.out.print("Digite o primeiro numero: ");
    x = sc.nextInt();
    System.out.print("Digite o segundo numero: ");
    y = sc.nextInt();
    soma = x + y;
    System.out.println("Soma = " + soma);

    sc.close();
  }
}
