package task.conditions;
import java.util.Scanner;
public class MinandMax {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("first number: ");
        double a = scanner.nextDouble();

        System.out.print("second number: ");
        double b = scanner.nextDouble();

        System.out.print("third number: ");
        double c = scanner.nextDouble();

       
        double min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);

        
        double max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        
        System.out.println("min value: " + min);
        System.out.println("max value: " + max);

        scanner.close();
    }
}