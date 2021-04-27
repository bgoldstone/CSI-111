/**
 * A class that creates a basic template for an employee.
 */
public abstract class Employee {
    protected String employeeName;
    protected int employeeID;

    /**
     * Employee Constructor
     *
     * @param employeeName Employee Name
     * @param employeeID   Employee ID number
     */
    public Employee(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    //Creates abstract method of calcPay which every employee must have

    /**
     * @param numberOfHours number of hours worked this week.
     * @return total amount payed for given employee.
     */
    public abstract double calcPay(int numberOfHours);

    /**
     * Sets Employee's name.
     *
     * @param employeeName Employee Name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * Sets Employee's ID.
     *
     * @param employeeID Employee ID
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets Employee's name.
     *
     * @return String Employee's Name
     */
    public String getEmployeeName() {
        return this.employeeName;
    }

    /**
     * Gets Employee's ID.
     *
     * @return int Employee's ID
     */
    public int getEmployeeID() {
        return this.employeeID;
    }

}
