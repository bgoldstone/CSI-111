package Lab04;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        String message = getInput();
        countAndPrint(message);
    }

    /**
     * A method to get input from user and inputs it as a string
     *
     * @return String that user inputs
     */
    public static String getInput() {
        System.out.println("Please enter a String to be counted: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Counts the values of letters, digits, whitespaces, and special characters
     */
    public static void countAndPrint(String msg) {
        /*
        initializes counting array
        Position    Type
        0           Letters
        1           Digits
        2           Whitespaces
        3           Special Characters
         */

        int[] count = {0,0,0,0};

        for (int i = 0; i < msg.length(); i++) {
            if (Character.isAlphabetic(msg.charAt(i))) {
                count[0]++;
            } else if (Character.isDigit(msg.charAt(i))) {
                count[1]++;
            } else if (Character.isWhitespace(msg.charAt(i))) {
                count[2]++;
            } else {
                count[3]++;
            }


        }
        System.out.println("Number of Letters: " + count[0]);
        System.out.println("Number of Digits: " + count[1]);
        System.out.println("Number of Whitespaces: " + count[2]);
        System.out.println("Number of Special Characters: " + count[3]);
    }

}
