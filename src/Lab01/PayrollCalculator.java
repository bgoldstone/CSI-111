package Lab01;
/*
  author: Ben Goldstone
 * date: 2/11/2021
 * Instructor: Professor Joseph Helsing
 * Description: Calculates gross pay for the number of given hours
 */
//imports libraries

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        //Creates new Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Variable declaration
        double hours; //number of hours worked
        double rate = 15.0; //hourly pay rate
        double pay; //gross pay

        //Program header
        System.out.println("Payroll Calculator\nAuthor: Ben Goldstone\n");

        //display prompt and gets input from user
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextDouble();

        //calculations
        //if under or equal to regular hours
        if (hours <= 40) {
            pay = hours * rate;
        }
        //else overtime
        else {
            pay = (hours - 40) * (1.5 * rate) + 40 * rate;
        }
        //displays results (Gross Pay)
        System.out.println("You earned $" + String.format("%.2f", pay));
    }
}
