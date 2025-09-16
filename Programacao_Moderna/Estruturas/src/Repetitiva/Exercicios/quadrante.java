package Repetitiva.Exercicios;

import java.util.Scanner;

public class quadrante {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os valores das coordenadas X e Y: ");
    int eixoX = sc.nextInt();
    int eixoY = sc.nextInt();

    while (eixoX != 0 && eixoY != 0) {
      if (eixoX < 0) {
        if (eixoY < 0) {
          System.out.println("QUADRANTE Q3");
        } else {
          System.out.println("QUADRANTE Q2");
        }
      }
      
      else if (eixoX > 0) {
        if (eixoY < 0) {
          System.out.println("QUADRANTE Q4");
        } else {
          System.out.println("QUADRANTE Q1");
        }
      }

      System.out.println("Digite os valores das coordenadas X e Y: ");
      eixoX = sc.nextInt();
      eixoY = sc.nextInt();
    }

    sc.close();
  }
}
