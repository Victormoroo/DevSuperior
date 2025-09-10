package Sequencial;

import java.util.Scanner;

  
public class entradaDeDados2 {
  public static void main(String[] args) {
    // Ler texto ate quebra de linha
    Scanner sc = new Scanner(System.in);

    int x;
    String s1, s2, s3;

    x = sc.nextInt();
    sc.nextLine(); // Consome a quebra de linha deixada pelo nextInt()
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();
  }
}
