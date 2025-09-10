package Sequencial;

import java.util.Scanner;

public class entradaDeDados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String x;
    x = sc.next();
    System.out.println("Você digitou: " + x);

    int y;
    y = sc.nextInt();
    System.out.println("Você digitou: " + y);

    double z;
    z = sc.nextDouble();
    System.out.println("Você digitou: " + z);
    // Caso queira utilzar o . ao inves de , basta colocar o
    // Locale.setDefault(Locale.US); antes de declarar a variavel z.

    char w;
    w = sc.next().charAt(0);
    System.out.println("Você digitou: " + w);

    // Ler varios dados na mesma linha
    String a;
    int b;
    double c;
    a = sc.next();
    b = sc.nextInt();
    c = sc.nextDouble();
    System.out.println("Você digitou: " + a + ", " + b + ", " + c);

    sc.close();

  }

}
