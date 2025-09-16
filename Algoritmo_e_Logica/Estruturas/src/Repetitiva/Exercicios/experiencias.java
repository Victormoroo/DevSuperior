package Repetitiva.Exercicios;

import java.util.Scanner;

public class experiencias {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos casos de teste serão digitados?: ");
    int n = sc.nextInt();

    int rato, sapo, coelho, total;

    rato = 0;
    sapo = 0;
    coelho = 0;
    total = 0;

    for (int i = 0; i < n; i++) {
      System.out.print("Quantidade de cobaias: ");
      int cobaias = sc.nextInt();
      System.out.print("Tipo de cobaia: ");
      char tipo = sc.next().charAt(0);

      total += cobaias;

      if (tipo == 'R' || tipo == 'r') {
        rato += cobaias;
      } else if (tipo == 'S' || tipo == 's') {
        sapo += cobaias;
      } else if (tipo == 'C' || tipo == 'c') {
        coelho += cobaias;
      } else {
        System.out.print("Caracter Inválido!!!\n");
        i--;
      }
    }

    double percentR = (double) rato / total * 100.0; 
    double percentS = (double) sapo / total * 100.0;
    double percentC = (double) coelho / total * 100.0;

    System.out.println("\nRELATÓRIO FINAL:");
    System.out.printf("TOTAL: %d cobaias%n", total);
    System.out.printf("Total de coelhos: %d%n", coelho);
    System.out.printf("Total de ratos: %d%n", rato);
    System.out.printf("Total de sapos: %d%n", sapo);

    System.out.printf("Percentual de coelhos: %.2f%%%n", percentC);
    System.out.printf("Percentual de ratos: %.2f%%%n", percentR);
    System.out.printf("Percentual de sapos: %.2f%%%n", percentS);

    sc.close();
  }
}
