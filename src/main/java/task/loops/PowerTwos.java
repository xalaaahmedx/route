package task.loops;
public class PowerTwos {
    public static void main(String[] args) {
        System.out.print("sequence:");

        int number = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(number);

            if (i < 10) {
                System.out.print(",");
            }

            number *= 2; 
        }
    }
}
