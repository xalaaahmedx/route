package task.loops;
import java.util.Scanner;

public class PositiveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double number;

        System.out.println("enter positive numbers use a negative number to stop :");

        while (true) {
            number = scanner.nextDouble();

            if (number < 0) {
                break; 
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("average of positive numbers: " + average);
        } else {
            System.out.println("did not enter positive numbers");
        }

        scanner.close();
    }
}
