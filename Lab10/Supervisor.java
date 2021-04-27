public class Supervisor extends Employee {
    private int supervisorLevel;
    private double supervisorPayRate;

    /**
     * Supervisor Constructor.
     *
     * @param employeeName      Employee's Name
     * @param employeeID        Employee's ID
     * @param supervisorLevel   Supervisor's level
     * @param supervisorPayRate Supervisor's Pay Rate
     */
    public Supervisor(String employeeName, int employeeID, int supervisorLevel, double supervisorPayRate) {
        //Calls Employee's Constructor Method.
        super(employeeName, employeeID);
        this.supervisorLevel = supervisorLevel;
        this.supervisorPayRate = supervisorPayRate;
    }

    @Override
    public double calcPay(int numberOfHours) {
        return (this.supervisorPayRate * numberOfHours) + (1000 * this.supervisorLevel);
    }

    /**
     * Sets Supervisor's level.
     *
     * @param supervisorLevel Supervisor's level
     */
    public void setSupervisorLevel(int supervisorLevel) {
        this.supervisorLevel = supervisorLevel;
    }

    /**
     * Sets Supervisor's pay rate.
     *
     * @param supervisorPayRate Supervisor's pay rate
     */
    public void setSupervisorPayRate(double supervisorPayRate) {
        this.supervisorPayRate = supervisorPayRate;
    }

    /**
     * Gets Supervisor's level.
     *
     * @return int Supervisor's level
     */
    public int getSupervisorLevel() {
        return this.supervisorLevel;
    }

    /**
     * Gets Supervisor's pay rate.
     *
     * @return double Supervisor's pay rate.
     */
    public double getSupervisorPayRate() {
        return this.supervisorPayRate;
    }
}
