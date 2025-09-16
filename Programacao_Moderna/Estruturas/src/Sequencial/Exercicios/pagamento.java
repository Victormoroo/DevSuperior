package Sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class pagamento {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = sc.next();
    System.out.print("Valor por hora: ");
    double valorHora = sc.nextDouble();
    System.out.print("Horas trabalhadas: ");
    int horasTrabalhadas = sc.nextInt();

    System.out.printf("O pagamento para %s deve ser %.2f", nome, valorHora * horasTrabalhadas);

    sc.close();
  }
}
