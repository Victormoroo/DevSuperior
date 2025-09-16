package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    double temp, result;

    System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
    char tempNome = sc.next().charAt(0);

    if (tempNome == 'F' || tempNome == 'f') {
      System.out.print("Digite a temperatura em Fahrenheit: ");
      temp = sc.nextDouble();

      result = (5.0 / 9.0) * (temp - 32.0);

      System.out.printf("Temperatura equivalente em Celsius: %.2f", result);
    }
    else if (tempNome == 'C' || tempNome == 'c') {
      System.out.print("Digite a temperatura em Celsius: ");
      temp = sc.nextDouble();

      result = (9.0 / 5.0) * temp + 32.0;

      System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", result);
    }
    else {
      System.out.print("Digite um valor válido!!!");
    }

    sc.close();
  }
}
