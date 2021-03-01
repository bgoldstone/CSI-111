package Lab04;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        String message = getInput();
        countAndPrint(message);
    }

    /**
     * A method to get input from user and inputs it as a string
     * @return String that user inputs
     */
    public static String getInput(){
        System.out.println("Please enter a String to be counted: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Counts and prints values of letters, digits, whitespaces, and special characters
     */
    public static void countAndPrint(String msg){

    }
}
