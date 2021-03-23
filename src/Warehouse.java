/**
 * @author Ben Goldstone
 * @version 3/26/21
 * Instructor: Professor Helsing
 * Description: Structures the Object Warehouse which keeps track of number of goods
 */
public class Warehouse {
    private int totalNumberOfGoods;

    public Warehouse(int totalNumberOfGoods) {
        this.totalNumberOfGoods = totalNumberOfGoods;
    }

    /**
     * @return Gets Total Number of Goods
     */
    public int getTotalNumberOfGoods() {
        return totalNumberOfGoods;
    }

    /**
     * @param addGoods Sets number of goods to add to the inventory
     */
    public void setAddGoods(int addGoods) {
        totalNumberOfGoods += addGoods; //Updates inventory
    }

    /**
     * @param removeGoods Sets number of goods to remove from the inventory
     */
    public void setRemoveGoods(int removeGoods) {
        //if trying to remove more inventory than is in inventory
        if (removeGoods > totalNumberOfGoods) {
            System.out.println("Cannot remove more goods than total number of goods!");
            System.out.printf("There is currently %d goods in inventory\n", getTotalNumberOfGoods());
            return;
        }
        totalNumberOfGoods -= removeGoods; //Updates inventory
    }
}
