package task.conditions;

import java.util.Scanner;

public class Watermelon {
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter weight: ");
        int weight = scanner.nextInt();

        if (weight > 2 && weight % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}