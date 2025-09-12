package Repetitiva.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media_idades {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as idades: ");
    int idade = sc.nextInt();

    if (idade < 0) {
      System.out.println("IMPOSSIVEL CALCULAR");
    } else {

      int aux = 0;
      int count = 0;
      double media = 0.0;

      while (idade > 0) {

        aux += idade;
        count = count + 1;

        idade = sc.nextInt();
      }
      
      media = (double) aux / count;
    
      System.out.printf("MEDIA = %.2f", media);
    }

    sc.close();
  }
}
