package Condicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class coordenadas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Valor de X: ");
    double eixoX = sc.nextDouble();

    System.out.print("Valor de Y: ");
    double eixoY = sc.nextDouble();

    if (eixoX == 0) {
      if (eixoY == 0) {
        System.out.print("Origem");
      }
      else {
        System.out.print("Eixo Y");
      }
    }
    else if (eixoY == 0) {
      System.out.print("Eixo X");
    }
    
    else if (eixoX < 0) {
      if (eixoY < 0) {
        System.out.print("Q3");
      } else {
        System.out.println("Q2");
      }
    }
    
    else if (eixoX > 0) {
      if (eixoY < 0) {
        System.out.print("Q4");
      } else {
        System.out.print("Q1");
      }
    }
    
    else {
      System.out.print("Valor inválido!!!");
    }

    sc.close();
  }
}
