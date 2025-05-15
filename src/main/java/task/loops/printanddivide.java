package task.loops;

public class printanddivide {

    public static void main(String[] args) {
        System.out.println("nums between 1 and 99 that are divisible by 5:");

        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
