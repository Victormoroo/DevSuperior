package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double total;

    System.out.print("Código do produto comprado: ");
    int codigo = sc.nextInt();

    System.out.print("Quantidade comprada: ");
    int quantidade = sc.nextInt();

    if (codigo == 1) {
      total = quantidade * 5.00;
    }
    else if (codigo == 2) {
      total = quantidade * 3.50;
    }
    else if (codigo == 3) {
      total = quantidade * 4.80;
    }
    else if (codigo == 4) {
      total = quantidade * 8.90;
    }
    else if (codigo == 5) {
      total = quantidade * 7.32;
    }
    else {
      System.out.println("Valor inválido!!");
      return;
    }

    System.out.printf("Valor a pagar: R$%.2f", total);

    sc.close();
  }
  
}
