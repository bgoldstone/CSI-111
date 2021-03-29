import java.util.Scanner;

/**
 * @author Ben Goldstone (bgoldstone@muhlenberg.edu)
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: Structures the Object Warehouse which keeps track of number of goods
 */
public class Warehouse {
    private int totalNumberOfGoods;
    private Scanner scan = new Scanner(System.in);
    private int tempGoods;
    public Warehouse(int totalNumberOfGoods) {
        this.totalNumberOfGoods = totalNumberOfGoods;
    }

    /**
     * Prints Total number of goods
     */
    public void getTotalNumberOfGoods() {
        System.out.println();
        System.out.printf("There is currently %d goods in the inventory", totalNumberOfGoods);
        System.out.println();
    }

    /**
     * Prompts user for number of goods to add to the inventory
     */
    public void addGoods() {
        System.out.print("\nHow many goods would you like to add? ");
        tempGoods = scan.nextInt();

        //checks to make sure not negative
        if (tempGoods >= 0) {
            totalNumberOfGoods += tempGoods;
        } else {
            System.out.println("Cannot add negative goods to inventory!\n");
        }
    }

    /**
     * Prompts user for number of goods to remove from the inventory
     */
    public void removeGoods() {
        //if trying to remove more inventory than is in inventory
        System.out.print("\nHow many goods would you like to remove? ");
        tempGoods = scan.nextInt();

        //checks to make sure not negative
        if (tempGoods > totalNumberOfGoods) {
            System.out.println("\nCannot remove more goods than total number of goods!");
            System.out.printf("There is currently %d goods in inventory\n", totalNumberOfGoods);
        } else if (tempGoods < 0) {
            System.out.println("\nCannot remove negative goods from inventory!");
            System.out.printf("There is currently %d goods in inventory\n", totalNumberOfGoods);
        } else {
            totalNumberOfGoods -= tempGoods;
        }

    }

}
