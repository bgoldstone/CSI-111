import java.util.Scanner;

public class ExamPracticeSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("For every 115sq ft one gallon of paint is required @ $18.00/hr of labor");
        System.out.println("How many rooms would you like painted?");
        int numberOfRooms = scan.nextInt();
        double totalSquareFootage = 0;
        double perPerson = 18;
        double[] roomSquareFootage = new double[numberOfRooms];
        for (int i = 0; i < roomSquareFootage.length; i++) {
            System.out.print("How much sq footage in room #" + (i + 1) + ": ");
            roomSquareFootage[i] = scan.nextDouble();
            System.out.println();
            totalSquareFootage += roomSquareFootage[i];
        }
        System.out.println("How much is one gallon of paint?");
        double galOfPaint = scan.nextDouble();
        int paintAndLaborMultiplier = (int) totalSquareFootage / 115;
        double laborTotalCost = paintAndLaborMultiplier*perPerson*8;
        numOfGallons(paintAndLaborMultiplier);
        hoursOfLabor(paintAndLaborMultiplier);
        amountOfPaint(paintAndLaborMultiplier);
        laborCost(laborTotalCost);
        totalCost((paintAndLaborMultiplier * galOfPaint) + laborTotalCost);
    }

    public static void numOfGallons(int total) {
        System.out.println("You need to get " + total + " gallons of paint");
    }

    public static void hoursOfLabor(int labor) {
        System.out.println("You will need " + 8 * labor + " hours of labor");

    }

    public static void amountOfPaint(int galsOfPaint) {
        System.out.println("You will need to buy " + galsOfPaint + " gallons of paint");
    }

    public static void laborCost(double laborTotalCost) {
        System.out.println("You will pay a total of $" + laborTotalCost + " for labor");

    }

    public static void totalCost(double cost) {
        System.out.println("You will pay a total of $" + cost);
    }
}
