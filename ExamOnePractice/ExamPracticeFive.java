import javax.swing.*;
import java.util.Scanner;

public class ExamPracticeFive {
    public static void main(String[] args) {
        double price;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many lbs is the package you are shipping? ");
        double weight = scan.nextDouble();
        System.out.println();
        if (0 < weight && weight <= 2) {
            price = 1.10;
        } else if (2 < weight && weight <= 6) {
            price = 2.20;
        } else if (6 < weight && weight <= 10) {
            price = 3.70;
        } else if (10 < weight) {
            price = 3.80;
        } else {
            System.out.println("Invalid Weight");
            return;
        }
        System.out.printf("Your total price for shipping %.2f lbs 500 miles is $%.2f\n", weight, price);
    }
}
