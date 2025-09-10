package Sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class troco {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double valorProduto, pago, troco;
    int quantidade;

    System.out.print("Digite o valor do produto: ");
    valorProduto = sc.nextDouble();
    System.out.print("Digite a quantidade: ");
    quantidade = sc.nextInt();
    System.out.print("Digite o valor pago: ");
    pago = sc.nextDouble();

    troco = pago - (valorProduto * quantidade);
    System.out.printf("Troco = %.2f", troco);

    sc.close();
  }
}
