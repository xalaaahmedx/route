package task.loops;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("nums from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " ");
        }

        System.out.println("nums from 100 to 1:");
        
       for (int i = 100; i >= 1; i--) {
            System.out.println(i + " ");
        }

    }
}
