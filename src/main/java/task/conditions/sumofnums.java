package task.conditions;

import java.util.Scanner;

public class sumofnums {
    
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveSum = 0;
        int negativeSum = 0;

        System.out.println("Enter 6 integers:");

        for (int i = 1; i <= 6; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();


            if (number > 0) {
                positiveSum += number;
         } else if (number < 0) {
                negativeSum += number;
            }
           
        }

        System.out.println("\nSum of positive numbers: " + positiveSum);
        System.out.println("Sum of negative numbers: " + negativeSum);

        scanner.close();
    }
}
