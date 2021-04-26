public class Supervisor extends Employee {
    private int supervisorLevel;
    private double supervisorPayRate;

    public Supervisor(String employeeName, int employeeID, int supervisorLevel, double supervisorPayRate) {
        super(employeeName, employeeID);
        this.supervisorLevel = supervisorLevel;
        this.supervisorPayRate = supervisorPayRate;
    }

    @Override
    public double calcPay(int numberOfHours) {
        return (this.supervisorPayRate * numberOfHours) + (1000 * this.supervisorLevel);
    }
    public void setSupervisorLevel(int supervisorLevel) {
        this.supervisorLevel = supervisorLevel;
    }

    public void setSupervisorPayRate(double supervisorPayRate) {
        this.supervisorPayRate = supervisorPayRate;
    }

    public int getSupervisorLevel() {
        return this.supervisorLevel;
    }

    public double getSupervisorPayRate() {
        return this.supervisorPayRate;
    }
}
