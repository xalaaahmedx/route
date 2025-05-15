package task.conditions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A, B, C, F): ");
        char grade = scanner.next().charAt(0); 

        switch (grade) {
            case 'A':
                System.out.println("marks are 80 or above");
                break;
            case 'B':
                System.out.println("marks are 60 or above but less than 80");
                break;
            case 'C':
                System.out.println("marks are 40 or above but less than 60");
                break;
            case 'F':
                System.out.println("marks are 40 or below");
                break;
            default:
                System.out.println("invalid grade");
                break;
        }

        scanner.close();
}
}
