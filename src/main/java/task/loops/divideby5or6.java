package task.loops;

public class divideby5or6 {

    public static void main(String[] args) {
        int count = 0;

        System.out.println("numbers divisible by 5 or 6 but not both 100 - 200:");

        for (int i = 100; i <= 200; i++) {
            boolean divisibleBy5 = i % 5 == 0;
            boolean divisibleBy6 = i % 6 == 0;

          
            if (divisibleBy5 ^ divisibleBy6) { 
                System.out.print(i + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
