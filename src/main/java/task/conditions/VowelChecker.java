package task.conditions;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a letter: ");
        String input = scanner.nextLine();
        char c = input.charAt(0);
       
      
            
            if (isVowel(c)) {

                System.out.println(c + " is a vowel");
            } else {
                System.out.println(c + " is a consonant");
            }
        

        scanner.close();
    }

     public static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
               c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
