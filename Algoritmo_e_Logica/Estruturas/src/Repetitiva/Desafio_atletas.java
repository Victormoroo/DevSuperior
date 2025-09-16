package Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_atletas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String nome, maisAlto = "";
    char sexo;
    double altura, peso, pesoAtletas = 0.0, alturaMaxima = 0.0, totalHomens = 0.0, alturaAtletas = 0.0, totalMulheres = 0.0;

    System.out.print("Qual a quantidade de atletas? ");
    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 1; i <= n; i++) {
      System.out.printf("Digite os dados do atleta numero %d:%n", i);

      System.out.print("Nome: ");
      nome = sc.nextLine();
      System.out.print("Sexo: ");
      sexo = sc.next().charAt(0);

      int valid = 0;
      while (valid == 0) {
        if (sexo != 'F' && sexo != 'f' && sexo != 'M' && sexo != 'm') {
          System.out.print("Valor inválido! Favor digitar F ou M: ");
          sexo = sc.next().charAt(0);
        } else {
          valid = 1;
        }

        if (sexo == 'M' || sexo == 'm') {
          totalHomens++;
        }
      }

      System.out.print("Altura: ");
      altura = sc.nextDouble();

      valid = 0;
      while (valid == 0) {
        if (altura <= 0) {
          System.out.print("Valor inválido! Favor digitar um valor positivo: ");
          altura = sc.nextDouble();
        } else {
          if (altura > alturaMaxima) {
            alturaMaxima = altura;
            maisAlto = nome;
          }
          valid = 1;
        }

        if (sexo == 'F'|| sexo == 'f') {
          alturaAtletas += altura;
          totalMulheres++;
        }
      }

      System.out.print("Peso: ");
      peso = sc.nextDouble();

      valid = 0;
      while (valid == 0) {
        if (peso <= 0) {
          System.out.print("Valor inválido! Favor digitar um valor positivo: ");
          peso = sc.nextDouble();
        } else {
          pesoAtletas += peso;
          valid = 1;
          sc.nextLine();
        }
      }

      System.out.println("------------------------------------");

    }
    
    double pesoMedio = pesoAtletas / n;
    double percentHomens = totalHomens / n * 100.0;
    double alturaMedia = alturaAtletas / totalMulheres;

    System.out.printf("%nRELATÓRIO:%n");
    System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
    System.out.printf("Atleta mais alto: %s%n", maisAlto);
    System.out.printf("Porcentagem de Homens: %.2f%%%n", percentHomens);

    if (totalMulheres == 0) {
      System.out.print("Não há mulheres cadastradas");
    } else {
      System.out.printf("Altura média das mulheres: %.2f%n", alturaMedia);
    }

    sc.close();
  }
}
