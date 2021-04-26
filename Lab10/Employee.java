public abstract class Employee {
    protected String employeeName;
    protected int employeeID;

    public Employee(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public abstract double calcPay(int numberOfHours);

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

}
