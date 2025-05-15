package task.conditions;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the month number (1-12): ");
        int month = scanner.nextInt();

        String monthName;

        switch (month) {
            case 1:  monthName = "january"; break;
            case 2:  monthName = "february"; break;
            case 3:  monthName = "march"; break;
            case 4:  monthName = "april"; break;
            case 5:  monthName = "may"; break;
            case 6:  monthName = "june"; break;
            case 7:  monthName = "july"; break;
            case 8:  monthName = "august"; break;
            case 9:  monthName = "september"; break;
            case 10: monthName = "october"; break;
            case 11: monthName = "november"; break;
            case 12: monthName = "december"; break;
            default: monthName = "Invalid month number"; break;
        }

        System.out.println("Month: " + monthName);

        scanner.close();
    }
}
