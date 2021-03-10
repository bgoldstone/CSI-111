package Lab04;
/*
 * Author: Ben Goldstone
 * Date: 3/5/2021
 * Instructor: Professor Joseph Helsing
 * Description: A program that counts the number of
 * letters, digits, whitespaces, and special characters in a string
 */

//imports libraries
import java.util.Arrays;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        //gets message
        String message = getInput();
        //gets count
        int[] stringCount = countString(message);
        //prints count
        printCount(stringCount);
    }

    /**
     * A method to get input from user and inputs it as a string
     *
     * @return String that user inputs
     */
    public static String getInput() {
        System.out.println("Please enter a String to be counted: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    /**
     * Counts the values of letters, digits, whitespaces, and special characters
     *
     * @param msg takes a message to count the number of letters, digits, whitespaces, and special characters
     * @return count of the given String in an integer array of size 4 including: {letters, digits, whitespaces, special characters}
     */
    public static int[] countString(String msg) {
        /*
        initializes counting array
        Position    Type
        0           Letters
        1           Digits
        2           Whitespaces
        3           Special Characters
         */

        int[] count = {0, 0, 0, 0};

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
        return Arrays.copyOf(count, count.length);
    }

    /**
     * Prints out Results of counts of letters, digits, whitespaces, special character
     *
     * @param counts array of counted numbers of letters, digits, whitespaces, and special characters
     */
    public static void printCount(int[] counts) {
        System.out.println("Number of Letters: " + counts[0]);
        System.out.println("Number of Digits: " + counts[1]);
        System.out.println("Number of Whitespaces: " + counts[2]);
        System.out.println("Number of Special Characters: " + counts[3]);
    }

}
