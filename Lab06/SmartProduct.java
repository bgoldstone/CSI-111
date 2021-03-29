/**
 * @author Ben Goldstone (bgoldstone@muhlenberg.edu)
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: contains the structure for a product object.
 */

public class SmartProduct {
    private int productID; //ID Number of the product
    private String productName; //name of product
    private int numberOfUnits; //number of units the customer wants to order
    private double pricePerUnit; //price of one unit of product
    private double totalCost; //total cost of order

    public SmartProduct(int productID, String productName, int numberOfUnits, double pricePerUnit) {
        this.productID = productID;
        this.productName = productName;
        this.numberOfUnits = numberOfUnits;
        this.pricePerUnit = pricePerUnit;
        totalCost = pricePerUnit * numberOfUnits;
    }

    /**
     * @return Gets name of item
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName Sets name of item
     */
    public void setProductName(String productName) {
        this.productName = productName;
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
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * @param pricePerUnit Sets price of item
     */
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
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

    /**
     * @return Gets ID number of the product
     */
    public int getProductID() {
        return productID;
    }

    /**
     * @param productID Sets ID number of the product
     */

    public void setProductID(int productID) {
        this.productID = productID;
    }
}
