package task.conditions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("number 1: ");
        int a = scanner.nextInt();

        System.out.print("number 2: ");
        int b = scanner.nextInt();

        System.out.print("number 3: ");
        int c = scanner.nextInt();

        int largest;

        
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("max number is: " + largest);

        scanner.close();
    }
}
