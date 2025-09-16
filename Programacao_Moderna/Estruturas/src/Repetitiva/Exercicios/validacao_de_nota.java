package Repetitiva.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class validacao_de_nota {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = sc.nextDouble();

    double nota2 = 0;
    int validacao1 = 0;
    int validacao2 = 0;

    while (validacao1 == 0) {

      if (nota1 >= 0 && nota1 <= 10) {
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        validacao1 = 1;

        while (validacao2 == 0) {

          if (nota2 >= 0 && nota2 <= 10) {
            validacao2 = 1;
          } else {
            System.out.print("Valor inválido! Tente novamente: ");
            nota2 = sc.nextDouble();
          }
        }
      } else {
        System.out.print("Valot inválido! Tente novamente: ");
        nota1 = sc.nextDouble();
      }
    }

    double media = (nota1 + nota2) / 2;

    System.out.printf("MEDIA = %.2f", media);

    sc.close();
  }
}
