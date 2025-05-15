
package task.conditions;

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("first number: ");
        double a = scanner.nextDouble();

        System.out.print("second number: ");
        double b = scanner.nextDouble();

        System.out.print("third number: ");
        double c = scanner.nextDouble();

        double temproraryNum;

        
        if (a > b) {
            temproraryNum  = a;
            a = b;
            b = temproraryNum;
        }

        if (a > c) {
            temproraryNum = a;
            a = c;
            c = temproraryNum;
        }

        
        if (b > c) {
            temproraryNum = b;
            b = c;
            c = temproraryNum;
        }


        System.out.println("numbers in ascending order:");
        System.out.println(a + ", " + b + ", " + c);

        scanner.close();
    }
}
