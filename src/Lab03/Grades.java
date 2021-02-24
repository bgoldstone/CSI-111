package Lab03;
/*
 * Author: Ben Goldstone
 * Date: 2/26/2021
 * Instructor: Professor Joseph Helsing
 * Description: A program that calculates a floating point average given a set of grades
 */


//import Scanner for User Input

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //initializes Scanner
        Scanner scan = new Scanner(System.in);

        //declaring/initializing variables
        double average = 0.0; //stores addition and average of all variables
        int count = 1; //counts how many grades to take average of
        char choice; //stores y or conditional value
        double grade = 0.0; //stores currently entered grade
        boolean continueLoop; //determines if loop continues
        do {
            continueLoop = false;
            System.out.println("Enter grade #" + count + ": ");
            grade = scan.nextDouble();
            scan.nextLine();
            if (grade < 0 || grade > 100) {
                System.out.print("Invalid Grade, ");
                continueLoop = true;
                continue;
            }
            average += grade;
            System.out.println("Do you have more grades to enter? (y/n)");
            choice = scan.nextLine().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                continueLoop = true;
            }

            if (continueLoop) count++;
        } while (continueLoop);
        average /= count;
        System.out.println("Your grade average is " + average);
    }

}