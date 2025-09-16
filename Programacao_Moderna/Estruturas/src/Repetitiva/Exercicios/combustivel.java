package Repetitiva.Exercicios;

import java.util.Scanner;

public class combustivel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int codigo = 0;
    int alcool, gasolina, diesel;

    alcool = 0;
    gasolina = 0;
    diesel = 0;

    while (codigo != 4) {
      System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
      codigo = sc.nextInt();

      if (codigo == 1) {
        alcool += 1;
      } else if (codigo == 2) {
        gasolina += 1;
      } else if (codigo == 3) {
        diesel += 1;
      }
    }

    System.out.println("MUITO OBRIGADO!");
    System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);

    sc.close();
  }
}
