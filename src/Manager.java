import java.util.Scanner;

/**
 * @author Ben Goldstone (bgoldstone@muhlenberg.edu)
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: Allows a user to manage an inventory of goods in a warehouse
 */

public class Manager {
    public static void main(String[] args) {
        //Creates instances of objects and variables
        Warehouse warehouse = new Warehouse(0);
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the Warehouse Management System!\n");
        while (choice != 4) {

            //Prompts users for choice
            System.out.println("What would you like to do? ");
            System.out.println("1. Add Goods");
            System.out.println("2. Remove Goods");
            System.out.println("3. Get total number of goods");
            System.out.println("4. Quit warehouse management system");
            System.out.print("Please enter 1,2,3 or 4: ");
            choice = scan.nextInt();

            //Takes action given the choice
            switch (choice) {
                case 1:
                    warehouse.addGoods();
                    break;
                case 2:
                    warehouse.removeGoods();
                    break;
                case 3:
                    warehouse.getTotalNumberOfGoods();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
            System.out.println();
        }
        System.out.println("Goodbye. Thank you for using the Warehouse Management System!");
    }

}
