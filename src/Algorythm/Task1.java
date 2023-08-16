package Algorythm;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < size; i++) {
      int x = scanner.nextInt();
      sum += x;
    }
    System.out.println(sum);
  }
}
