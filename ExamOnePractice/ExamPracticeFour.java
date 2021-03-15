import java.util.Scanner;

public class ExamPracticeFour {
    public static void main(String[] args) {
        double testScoreOne, testScoreTwo, testScoreThree;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Test Score #1: ");
        testScoreOne = scan.nextDouble();
        System.out.print("\nEnter Test Score #2: ");
        testScoreTwo = scan.nextDouble();
        System.out.print("\nEnter Test Score #3: ");
        testScoreThree = scan.nextDouble();
        double average = (double) (testScoreOne + testScoreTwo + testScoreThree) / 3;
        if (average >= 90 && average <= 100) {
            System.out.println("Your average is an A");
        } else if (average >= 80 && average <= 89) {
            System.out.println("Your average is a B");
        } else if (average >= 70 && average <= 79) {
            System.out.println("Your average is a C");
        }else if (average >= 60 && average <= 69){
            System.out.println("Your average is a D");
        }else{
            System.out.println("Your average is an F");
        }
    }
}
