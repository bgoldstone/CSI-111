import java.util.Scanner;

/**
 * Tells user what data type is inserted in the scanner
 *
 * @author Ben Goldstone
 */
/*
    Instructor: Professor Joseph Helsing
    Date: 4/16/2021
 */
public class TypeChecker {
    private static int integerValue; //Stores integer value.
    private static double doubleValue; //Stores double value.

    public static void main(String[] args) {
        //Stores Scanner object.
        Scanner scan = new Scanner(System.in);

        //Prompts user for input.
        System.out.print("Type in a value: ");
        String line = scan.nextLine();
        System.out.println();
        scan.close();
        //If is integer, tell user.
        if (tryInt(line)) {
            System.out.printf("The value %d is integer data\n", integerValue);
        //If is double, tell user.
        } else if (tryDouble(line)) {
            System.out.printf("The value %f is double data\n", doubleValue);
        //If no data besides whitespaces, tell user.
        } else if (line.trim().length() == 0) {
            System.out.printf("The value \"%s\" is only whitespace data\n", line);
        //Else, it must be text.
        } else {
            System.out.printf("The value \"%s\" is text data\n", line);
        }
    }

    /**
     * Tells user if data is integer
     * @param text String input to test
     * @return boolean
     */
    private static boolean tryInt(String text) {
        try {
            integerValue = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    /**
     * Tells user if data is double
     * @param text String input to test
     * @return boolean
     */
    private static boolean tryDouble(String text) {
        try {
            doubleValue = Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
