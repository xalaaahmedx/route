package task.conditions;

import java.util.Scanner;

public class MonthSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 12: case 1: case 2:
                season = "Winter";
                break;
            case 3: case 4: case 5:
                season = "spring";
                break;
            case 6: case 7: case 8:
                season = "summer";
                break;
            case 9: case 10: case 11:
                season = "autumn";
                break;
            default:
                season = "invalid month number";
                break;
        }

        System.out.println("season: " + season);
        scanner.close();
    }
}
