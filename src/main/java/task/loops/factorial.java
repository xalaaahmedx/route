package task.loops;
 import java.util.Scanner;
public class factorial {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("number: ");
        int number = scanner.nextInt();

       
        if (number < 0) {
            System.out.println("no factorial");
        } else {
            double factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("factorial of " + number + " is " + factorial);
        }

        scanner.close();
    }
}

