package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle rectangle = new Rectangle();

    System.out.println("Entre com a largura e altura do retângulo:");
    rectangle.width = sc.nextDouble();
    rectangle.height = sc.nextDouble();

    System.out.print(rectangle);

    sc.close();
  }
}
