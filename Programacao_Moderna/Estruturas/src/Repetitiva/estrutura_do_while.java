package Repetitiva;

import java.util.Scanner;

public class estrutura_do_while {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char resp;

    do {
      System.out.print("Digite a temperatura em Celsius: ");
      double tempC = sc.nextDouble();

      double tempF = (9.0 * tempC) / 5.0 + 32;
      System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempF);

      System.out.print("Deseja repetir (s/n)? ");
      resp = sc.next().charAt(0);
    } while (resp != 'n');

    sc.close();
  }
}
