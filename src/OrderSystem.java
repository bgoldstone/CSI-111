import java.util.Scanner;
/**
 * @author Ben Goldstone
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: Takes users order information including name, number of units,
 * and tells user total cost
 */
public class OrderSystem {
    public static void main(String[] args) {

        //Creates instances of objects
        Scanner scan = new Scanner(System.in);
        Product product = new Product();

        //Prompts User for Information
        System.out.println("Welcome to the Product Ordering System!");
        System.out.print("What is the name of the product you want to order? ");
        product.setName(scan.nextLine());
        System.out.printf("How many units of %s do you want? ", product.getName());
        product.setNumberOfUnits(scan.nextInt());
        product.setPrice(9.99);

        //Calculates Total
        calcTotal(product);

        //Prints Final Results
        System.out.println("\n####################");
        System.out.printf("Name: %s", product.getName());
        System.out.printf("\nUnits: %d", product.getNumberOfUnits());
        System.out.printf("\nPrice per Unit: $%.2f", product.getPrice());
        System.out.printf("\nTotal Price: $%.2f", product.getTotalCost());
        System.out.println("\n####################");
    }

    /**
     * Calculates total cost depending on price and units
     * @param product takes an object of Product
     */
    private static void calcTotal(Product product){
        product.setTotalCost(product.getPrice()*product.getNumberOfUnits());
    }
}
