
package task.loops;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("base: ");
        double base = scanner.nextDouble();

     
        System.out.print("power: ");
        double power = scanner.nextDouble();

     
        double result = Math.pow(base, power);

        // Output the result
        System.out.println(base + " to power of " + power + " is: " + result);

        scanner.close();
    }
}
