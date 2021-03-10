//import Libraries

import java.util.Scanner;
import java.lang.Math;

/*
 * Author: Ben Goldstone
 * Date: 2/19/2021
 * Instructor: Professor Joseph Helsing
 * Description: A program that Calculates Volume for given object
 */
public class Volume {
    public static void main(String[] args) {
        //initializes Variables
        final double PI = 3.1415;
        String choice;
        double volume = 0;
        int radius;

        //initializes Scanner
        Scanner scan = new Scanner(System.in);

        //Prompts user for what they are calculating the volume of
        System.out.println("Would you like to calculate the Volume of a sphere, cylinder, or cone? ");
        choice = scan.nextLine();
        choice = choice.toLowerCase();

        //determines what they are calculating the volume of and calculates volume
        if (choice.equals("sphere")) {
            System.out.println("What is the radius of this " + choice + "? ");
            radius = scan.nextInt();
            volume = (4.0 / 3) * PI * Math.pow(radius, 3);
        } else if (choice.equals("cylinder")) {
            System.out.println("What is the radius of this " + choice + "? ");
            radius = scan.nextInt();
            System.out.println("What is the height of this " + choice + "? ");
            int height = scan.nextInt();
            volume = PI * Math.pow(radius, 2) * height;
        } else if (choice.equals("cone")) {
            System.out.println("What is the radius of this " + choice + "? ");
            radius = scan.nextInt();
            System.out.println("What is the height of this " + choice + "? ");
            int height = scan.nextInt();
            volume = PI * Math.pow(radius, 2) * height / 3;
            //error checks input
        } else {
            System.out.println("Invalid Choice");
        }
        //provides answer
        System.out.println("The volume of the " + choice + " is " + volume);
    }
}
