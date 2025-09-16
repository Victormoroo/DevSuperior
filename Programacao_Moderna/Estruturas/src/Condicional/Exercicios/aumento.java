package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aumento {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double salarioNovo, aumento;
    int percent;

    System.out.print("Digite o salario da pessoa: ");
    double salarioAntigo = sc.nextDouble();

    if (salarioAntigo <= 1000.00) {
      salarioNovo = salarioAntigo * 1.2;
      aumento = salarioAntigo * 0.2;
      percent = 20;
    } else if (salarioAntigo > 1000.00 && salarioAntigo <= 3000.00) {
      salarioNovo = salarioAntigo * 1.15;
      aumento = salarioAntigo * 0.15;
      percent = 15;
    } else if (salarioAntigo > 3000.00 && salarioAntigo <= 8000.00) {
      salarioNovo = salarioAntigo * 1.1;
      aumento = salarioAntigo * 0.1;
      percent = 10;
    } else {
      salarioNovo = salarioAntigo * 1.05;
      aumento = salarioAntigo * 0.05;
      percent = 5;
    }

    System.out.printf("Novo salário: R$%.2f%n", salarioNovo);
    System.out.printf("Aumento: R$%.2f%n", aumento);
    System.out.printf("Porcentagem: %d %%", percent);

    sc.close();
  }
}
