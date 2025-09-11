package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_imposto {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Renda anual com salário: ");
    double salarioAnual = sc.nextDouble();
    System.out.print("Renda anual com prestação de serviço: ");
    double rendaPrestacao = sc.nextDouble();
    System.out.print("Renda anual com ganho de capital: ");
    double ganhoCapital = sc.nextDouble();
    System.out.print("Gastos médicos: ");
    double gastosMedicos = sc.nextDouble();
    System.out.print("Gastos adicionais: ");
    double gastosaEducacionais = sc.nextDouble();

    double impostoServico = rendaPrestacao * 0.15;
    double impostoCapital = ganhoCapital * 0.20;
    double rendaMensal = salarioAnual / 12;
    double impostoSalario;

    if (rendaMensal < 3000.00) {
      impostoSalario = 0;
    } else if (rendaMensal >= 3000.00 && rendaMensal < 5000.00) {
      impostoSalario = salarioAnual * 0.10;
    } else {
      impostoSalario = salarioAnual * 0.20;
    }

    double impostoTotal = impostoServico + impostoCapital + impostoSalario;

    double dedutiveis = gastosMedicos + gastosaEducacionais;
    double maxDedutivel = impostoTotal * 0.30;
    double abatimento;

    if (dedutiveis <= maxDedutivel) {
      abatimento = dedutiveis;
    } else {
      abatimento = maxDedutivel;
    }

    System.out.println("RELATÓRIO DE IMPOSTO DE RENDA\n");

    System.out.println("COSOLIDADO DE RENDA:");
    if (impostoSalario < 3000) {
      System.out.printf("Imposto sobre o salário: ISENTO\n");
    } else {
      System.out.printf("Imposto sobre o salário: %.2f\n", impostoSalario);
    }
    System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
    System.out.printf("Imposto sobre ganho de capital: %.2f%n%n", impostoCapital);

    System.out.println("DEDUÇÕES:");
    System.out.printf("Máximo dedutível: %.2f%n", maxDedutivel);
    System.out.printf("Gastos dedutíveis: %.2f%n%n", dedutiveis);

    System.out.println("RESUMO:");
    System.out.printf("Imposto bruto total: %.2f%n", impostoTotal);
    System.out.printf("Abatimento: %.2f%n", abatimento);
    System.out.printf("Imposto devido: %.2f", impostoTotal - abatimento);

    sc.close();
  }
}
