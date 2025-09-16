package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double troco;

    System.out.print("Preço unitário do produto: ");
    double preco = sc.nextDouble();
    System.out.print("Quantidade comprada: ");
    int quantidade = sc.nextInt();
    System.out.print("Dinheiro recebido: ");
    double dinheiro = sc.nextDouble();

    double total = preco * quantidade;

    if (total < dinheiro) {
      troco = dinheiro - total;
      System.out.printf("TROCO = %.2f", troco);
    }
    else {
      troco = total - dinheiro;
      System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", troco);
    }

    sc.close();
  }
}
