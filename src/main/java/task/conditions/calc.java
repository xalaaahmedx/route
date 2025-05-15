package task.conditions;
import java.util.Scanner;

public class calc {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("enter the first number: ");
        double num1 = scanner.nextDouble();

     
        System.out.print("enter the second number: ");
        double num2 = scanner.nextDouble();


        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        boolean validOperation = true;

      
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Can not divide by zero");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
                validOperation = false;
                result = 0;
        }

        if (validOperation) {
            System.out.println("result: " + result);
        }

        scanner.close();
    }
}


