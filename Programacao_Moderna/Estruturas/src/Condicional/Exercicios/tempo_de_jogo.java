package Condicional.Exercicios;

import java.util.Scanner;

public class tempo_de_jogo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int horaInicial, horaFinal;

    System.out.print("Hora inicial: ");
    horaInicial = sc.nextInt();

    System.out.print("Hora final: ");
    horaFinal = sc.nextInt();

    if (horaInicial < horaFinal) {
      System.out.printf("O JOGO DUROU %d HORAS", horaFinal - horaInicial);
    }
    else {
      System.out.printf("O JOGO DUROU %d HORAS", 24 - (horaInicial - horaFinal));
    }

    sc.close();
  }
}
