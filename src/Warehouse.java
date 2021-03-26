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

    public Warehouse(int totalNumberOfGoods) {
        this.totalNumberOfGoods = totalNumberOfGoods;
    }

    /**
     * Prints Total Number of Goods
     */
    public void getTotalNumberOfGoods() {
        System.out.println();
        System.out.printf("There is currently %d goods in the inventory", totalNumberOfGoods);
        System.out.println();
    }

    /**
     * Sets number of goods to add to the inventory
     */
    public void addGoods() {
        System.out.print("How many goods would you like to add? ");
        int goodsToAdd = scan.nextInt();

        //checks to make sure not negative
        if (goodsToAdd >= 0) {
            totalNumberOfGoods += goodsToAdd;
        } else {
            System.err.println("Cannot add negative goods to inventory!\n");
        }
    }

    /**
     * Sets number of goods to remove from the inventory
     */
    public void removeGoods() {
        //if trying to remove more inventory than is in inventory
        System.out.print("How many goods would you like to remove? ");
        int goodsToRemove = scan.nextInt();

        //checks to make sure not negative
        if (goodsToRemove > totalNumberOfGoods) {
            System.out.println("Cannot remove more goods than total number of goods!");
            System.out.printf("There is currently %d goods in inventory\n", totalNumberOfGoods);
        } else if (goodsToRemove < 0) {
            System.err.println("Cannot remove negative goods from inventory!\n");
            System.out.printf("There is currently %d goods in inventory\n", totalNumberOfGoods);
        } else {
            totalNumberOfGoods += goodsToRemove;
        }

    }

}
