import java.util.Scanner;

public class ExamPracticeThree {
    public static void main(String[] args) {
        int recipeMakes = 48;
        double sugarAmount = 1.5;
        double butterAmount = 1;
        double flourAmount = 2.75;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many cookies do you want to make? ");
        int userAmount = scan.nextInt();
        if(recipeMakes == userAmount){
            System.out.println("You will need: ");
            System.out.printf("\t %d cups of sugar", sugarAmount);
            System.out.printf("\t %d cups of butter", butterAmount);
            System.out.printf("\t %d cups of flour", flourAmount);
        } else {
            double multiplier = (double)userAmount/recipeMakes;
            sugarAmount *= multiplier;
            butterAmount *= multiplier;
            flourAmount *= multiplier;
            System.out.println("You will need: ");
            System.out.printf("\t%.2f cups of sugar\n", sugarAmount);
            System.out.printf("\t%.2f cups of butter\n", butterAmount);
            System.out.printf("\t%.2f cups of flour\n", flourAmount);
        }
    }
}
