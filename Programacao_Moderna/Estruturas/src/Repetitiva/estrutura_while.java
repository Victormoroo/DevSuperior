package Repetitiva;

import java.util.Scanner;

public class estrutura_while {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 0 para obter o resultado!");
    System.out.print("Digite os números para receber a SOMA: ");
    int num = sc.nextInt();

    int soma = 0;

    while (num != 0) {
      soma += num;
      System.out.print("Digite os números para receber a SOMA: ");
      num = sc.nextInt();
    }

    System.out.println("RESULTADO = " + soma);

    sc.close();
  }
}
