import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(0);
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        printNumOfGoods(warehouse);
        System.out.println();
        while (choice != 4) {
            System.out.println("What would you like to do? ");
            System.out.println("1. Add Goods");
            System.out.println("2. Remove Goods");
            System.out.println("3. Get total number of goods");
            System.out.println("4. Quit warehouse management system");
            System.out.print("Please enter 1,2,3 or 4: ");
            choice = scan.nextInt();
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
                    printNumOfGoods(warehouse);
                    System.out.println();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
    }

    private static void printNumOfGoods(Warehouse warehouse) {
        System.out.printf("There is currently %d goods in inventory", warehouse.getTotalNumberOfGoods());
    }
}
