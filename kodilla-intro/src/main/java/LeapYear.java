import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year: ");
        int year = scanner.nextInt();

        System.out.println("Please check if " + year + " is a leap year.");

        if ((year %4 == 0 && year %100 != 0) || (year %4 == 0 && year %100 == 0 && year%400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        }
        else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}
