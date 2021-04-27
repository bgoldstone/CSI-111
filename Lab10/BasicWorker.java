/**
 * Object of a basic worker.
 */
public class BasicWorker extends Employee {
    private int workerShift;
    private double workerPayRate;

    //Initializes Basic Worker.

    /**
     * BasicWorker Constructor.
     * @param employeeName Employee's Name
     * @param employeeID Employee's ID
     * @param workerShift Worker's Shift number
     * @param workerPayRate Worker's Pay Rate
     */
    public BasicWorker(String employeeName, int employeeID, int workerShift, double workerPayRate) {
        //Calls Employee constructor.
        super(employeeName, employeeID);
        this.workerShift = workerShift;
        this.workerPayRate = workerPayRate;
    }

    @Override
    public double calcPay(int numberOfHours) {
        return this.workerPayRate * numberOfHours;
    }

    /**
     * Sets Worker's shift.
     * @param workerShift Worker's Shift number
     */
    public void setWorkerShift(int workerShift) {
        this.workerShift = workerShift;
    }

    /**
     * Sets Worker's pay rate.
     * @param workerPayRate Worker's pay rate
     */
    public void setWorkerPayRate(double workerPayRate) {
        this.workerPayRate = workerPayRate;
    }

    /**
     * Gets Worker's shift.
     * @return int Worker's shift number
     */
    public int getWorkerShift() {
        return this.workerShift;
    }

    /**
     * Gets Worker's pay rate.
     * @return double Worker's pay rate
     */
    public double getWorkerPayRate() {
        return this.workerPayRate;
    }

}
