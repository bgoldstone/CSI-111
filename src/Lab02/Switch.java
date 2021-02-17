package Lab02;

//import Scanner Library
import java.util.Scanner;

/*
 * Author: Ben Goldstone
 * Date: 2/19/2021
 * Instructor: Professor Joseph Helsing
 * Description: A program that quizzes you on the the farthest planet from the sun
 */
public class Switch {
    public static void main(String[] args) {
        //initializes Variable
        char choice;

        //initializes Scanner
        Scanner scan = new Scanner(System.in);

        //Question
        System.out.println("Welcome to the 111 quiz. Please choose the correct answer to the following question:");
        System.out.println("Which planet in our solar system is on average farthest away from the sun?");
        System.out.println("A. Mercury");
        System.out.println("B. Jupiter");
        System.out.println("C. Neptune");
        System.out.println("D. Saturn");
        System.out.println("E. Pluto");
        System.out.println("Please enter your choice (A, B, C, D, or E):");

        //Scans Choice
        choice = scan.next().charAt(0);
        switch (choice) {
            case 'A':
            case 'B':
            case 'D':
            case 'E':
                System.out.println("That is incorrect! Neptune is the planted farthest away from the sun.");
                break;
            case 'C':
                System.out.println("That is correct! Neptune is the planted farthest away from the sun.");
                break;
            default:
                System.out.println("That is not a valid choice.");
                break;
        }
        System.out.println("Good Bye");
    }
}
