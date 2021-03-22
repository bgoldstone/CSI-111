/**
 * @author Ben Goldstone
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: contains the structure for a product object.
 */

public class SmartProduct {
    private final int id; //ID Number of the Object
    private final String name; //name of product
    private int numberOfUnits; //number of units the customer wants to order
    private double price; //price of one unit of product
    private double totalCost; //total cost of order

    public SmartProduct(int id, String name, int numberOfUnits, double price) {
        this.id = id;
        this.name = name;
        this.numberOfUnits = numberOfUnits;
        this.price = price;
        totalCost = price * numberOfUnits;
    }

    /**
     * @return Gets name of item
     */
    public String getName() {
        return name;
    }

    /*
     * @param name Sets name of item
     *
    public void setName(String name) {
        this.name = name;
    }
    */

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

    /*
     * @param totalCost Sets total cost of customer's order

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    */

    /**
     * @return Gets ID number of the product
     */
    public int getId() {
        return id;
    }

    /*
     * @param id Sets ID number of the product

    public void setId(int id) {
        this.id = id;
    }

     */
}
