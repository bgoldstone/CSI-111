/**
 * @author Ben Goldstone (bgoldstone@muhlenberg.edu)
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: contains the structure for a product object.
 */

public class Product {
    private String name; //name of product
    private int numberOfUnits; //number of units the customer wants to order
    private double price; //price of one unit of product
    private double totalCost; //total cost of order

    /**
     * @return Gets name of item
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Sets name of item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Gets number of units customer wants to order
     */
    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * @param numberOfUnits Sets number of units customer wants to order
     */
    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    /**
     * @return Gets price of item
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price Sets price of item
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return Gets total cost of customer's order
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost Sets total cost of customer's order
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
