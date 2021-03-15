import java.util.Scanner;

public class ExamPracticeSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hoursPerPlan = 0;
        double rate = 0;
        double additionalTimeRate = 0;
        System.out.print("Which plan do you have? (A,B, or C) ");
        char plan = scan.nextLine().toUpperCase().charAt(0);
        System.out.print("How many hours did you use? ");
        System.out.println();
        double hours = scan.nextDouble();
        switch (plan){
            case 'A':
                rate = 9.95;
                hoursPerPlan = 10;
                additionalTimeRate = 2.00;
                break;
            case 'B':
                rate = 13.95;
                hoursPerPlan = 20;
                additionalTimeRate = 1;
                break;
            case 'C':
                rate = 19.95;
                break;
            default:
                System.out.println("Invalid plan!");
                break;
        }
        if(plan == 'A' || plan == 'B' || plan == 'C'){
            double total = rate;
            total += ((hours-hoursPerPlan)*additionalTimeRate);
            System.out.printf("You will be charged $%.2f for plan %c at %.2f hours",total,plan,hours);
        }else return;
    }
}
