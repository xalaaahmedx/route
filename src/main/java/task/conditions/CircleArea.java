package task.conditions;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("radius of the circle: ");
        double radius = scanner.nextDouble();

      
        double area = Math.PI * radius * radius;

        
        System.out.println("area is: " + area);

        scanner.close();
    }
}
