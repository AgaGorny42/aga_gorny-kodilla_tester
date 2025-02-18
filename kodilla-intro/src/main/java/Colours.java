import java.util.Scanner;

public class Colours {


    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (R-red, B-blue, Y-yellow, G-green):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "R":
                    return "RED";
                case "B":
                    return "BLUE";
                case "Y":
                    return "YELLOW";
                case "G":
                    return "GREEN";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
