package task.loops;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("enter integer: ");
        int number = scanner.nextInt();

        int originalNumber = number; 
        number = Math.abs(number);   
        int sum = 0;

       
        while (number > 0) {
            int digit = number % 10;  
            sum += digit;              
            number /= 10;             
        }

     
        System.out.println("sum of digits of " + originalNumber + " is: " + sum);

        scanner.close();
    }
}
