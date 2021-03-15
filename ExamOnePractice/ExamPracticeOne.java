import java.util.Scanner;

public class ExamPracticeOne {
    public static void main(String[] args) {
        final double stateSalesTax = 0.02;
        final double countySalesTax = 0.04;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an amount to tax $");
        double amount = scan.nextDouble();
        System.out.println();
        amount *= (1 + (stateSalesTax + countySalesTax));
        System.out.printf("Your total is $%.2f", amount);
    }
}
