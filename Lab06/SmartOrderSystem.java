import java.util.Scanner;

/**
 * @author Ben Goldstone (bgoldstone@muhlenberg.edu)
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: Takes users order information including name, number of units,
 * and tells user total cost
 */
public class SmartOrderSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Product product = new Product();
        /* OLD CODE
        System.out.print("What is the name of the product you want to order? ");
        smartProduct.setName(scan.nextLine());
        System.out.printf("How many units of %s do you want? ", smartProduct.getName());
        smartProduct.setNumberOfUnits(scan.nextInt());
        smartProduct.setPrice(9.99);
        calcTotal(smartProduct);*/
        System.out.println("Welcome to the Product Ordering System!");
        System.out.print("How many products would you like to order? ");
        SmartProduct[] smartProducts = new SmartProduct[scan.nextInt()];
        System.out.println();
        //declares local item variables
        int id, units;
        String name;
        double price;

        //Prompts each user for product information
        for (int i = 0; i < smartProducts.length; i++) {
            System.out.printf("Time for product #%d!\n", i+1);
            System.out.print("What is the unique product ID number: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("\nWhat is the name of the product: ");
            name = scan.nextLine();
            System.out.printf("\nHow many %s you would like to buy? ", name.toLowerCase());
            units = scan.nextInt();
            System.out.printf("\nWhat is the price of %s: $", name.toLowerCase());
            price = scan.nextDouble();
            System.out.println();
            smartProducts[i] = new SmartProduct(id,name, units, price);
        }

        //Prints Totals
        System.out.print("\n###################################");
        for (SmartProduct smartProduct : smartProducts) {
            System.out.printf("\nID: %d", smartProduct.getProductID());
            System.out.printf("\nName: %s", smartProduct.getProductName());
            System.out.printf("\nUnits: %d", smartProduct.getNumberOfUnits());
            System.out.printf("\nPrice per %s: $%.2f", smartProduct.getProductName().toLowerCase(), smartProduct.getPricePerUnit());
            System.out.printf("\nTotal cost for %s: $%.2f\n", smartProduct.getProductName().toLowerCase(), smartProduct.getTotalCost());
        }
        System.out.printf("\nTotal order cost: $%.2f\n", calcTotal(smartProducts));
        System.out.println("###################################");
    }

    /**
     * Calculates total cost of all ordered items
     *
     * @param smartProduct takes an object of Product
     */
    private static double calcTotal(SmartProduct[] smartProduct) {
        double total = 0;
        for (SmartProduct smartObject : smartProduct) {
            total += smartObject.getTotalCost();
        }
        return total;
    }
}
