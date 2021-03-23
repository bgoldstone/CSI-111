import java.util.Scanner;

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
                    System.out.print("How many goods would you like to add? ");
                    warehouse.setAddGoods(scan.nextInt());
                    break;
                case 2:
                    System.out.print("How many goods would you like to remove? ");
                    warehouse.setRemoveGoods(scan.nextInt());
                    break;
                case 3:
                    System.out.println();
                    System.out.printf("There is currently %d goods in the inventory", warehouse.getTotalNumberOfGoods());
                    System.out.println();
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