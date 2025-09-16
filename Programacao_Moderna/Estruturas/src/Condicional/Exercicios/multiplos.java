package Condicional.Exercicios;

import java.util.Scanner;

public class multiplos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois números inteiros:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    if (num1 % num2 == 0 || num2 % num1 == 0) {
      System.out.println("São múltiplos!");
    }
    else {
      System.out.println("Não são múltiplos!");
    }

    sc.close();
  }
}
