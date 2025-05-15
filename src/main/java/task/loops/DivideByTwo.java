package task.loops;

import java.util.Scanner;

public class DivideByTwo {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("enter number: ");
        int number = scanner.nextInt();

        int count = 0;
        double value = number;

        
        while (value >= 1) {
            value = value / 2;
            count++;
        }

        System.out.println("number can be divided by 2 a total of " + count + " times before it becomes less than 1");

        scanner.close();
    }
}


