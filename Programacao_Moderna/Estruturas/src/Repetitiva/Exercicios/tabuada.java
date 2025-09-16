package Repetitiva.Exercicios;

import java.util.Scanner;

public class tabuada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Deseja tabuada para qual valor?: ");
    int num = sc.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d X %d = %d\n", num, i, num * i);
    }
    
    sc.close();
  }
}
