package Sequencial.Exercicios;

import java.util.Scanner;

public class duracao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a duração em segundos: ");
    int segundosTotais = sc.nextInt();

    int resto;

    int horas = segundosTotais / 3600;
    resto = segundosTotais % 3600;

    int minutos = resto / 60;
    int segundos = resto % 60;

    System.out.printf("%d:%d:%d", horas, minutos, segundos);
  }
}
