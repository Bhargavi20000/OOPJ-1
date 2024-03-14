import java.util.Scanner;

public class Day{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int DayNumber = scanner.nextInt();

        String Day;
        switch (DayNumber) {
            case 1:
                Day = "Monday";
                break;
            case 2:
                Day = "Tuesday";
                break;
            case 3:
                Day = "Wednesday";
                break;
            case 4:
                Day = "Thursday";
                break;
            case 5:
                Day = "Friday";
                break;
            case 6:
                Day = "Saturday";
                break;
            case 7:
                Day = "Sunday";
                break;
            default:
                Day = "Invalid number";
                break;
        }

        System.out.println("Day: " + Day);
    }
}
