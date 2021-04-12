import java.util.Scanner;

public class TypeChecker {
    private static int integerValue;
    private static double doubleValue;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type in a value: ");
        String line = scan.nextLine();
        System.out.println();
        if (tryInt(line)) {
            System.out.printf("The value %s is integer data\n", line);
        } else if (tryDouble(line)) {
            System.out.printf("The value %s is double data\n", line);
        } else if (line.trim().length() == 0) {
            System.out.printf("The value %s is only whitespace data\n", line);
        } else {
            System.out.printf("The value %s is text data\n", line);
        }
    }

    private static boolean tryInt(String number) {
        try {
            integerValue = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean tryDouble(String number) {
        try {
            doubleValue = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
