package Lab01;
/*
  author: Ben Goldstone
 * date: 2/11/2021
 * Instructor: Professor Joseph Helsing
 * Description: Calculates area for given length and width
 */
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //Gets input from user's keyboard
        Scanner keyboard = new Scanner(System.in);

        //Variable declarations
        double length;
        double width;
        double area;
        //Program Header
        System.out.println("Area Calculator\nAuthor: Ben Goldstone\n");

        //Gets length and width from the User
        System.out.print("What is the length of your rectangle (or square)? ");
        length = keyboard.nextDouble();
        System.out.print("\nWhat is the width of your rectangle (or square)? ");
        width = keyboard.nextDouble();

        //Calculates area
        area = width * length;

        //finds out if dimensions are square or rectangular
        if(width == length){
            System.out.println("\n\n The area of the square is " + area);
        }else{
            System.out.println("\n\n The area of the rectangle is " + area);
        }
    }
}
