package Sequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class consumo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Distância percorrida: ");
    int distancia = sc.nextInt();
    System.out.print("Combustível gasto: ");
    double combustivel = sc.nextDouble();

    System.out.printf("Consumo médio = %.3f", distancia / combustivel);

    sc.close();
  }
}
