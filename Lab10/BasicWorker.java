public class BasicWorker extends Employee {
    private int workerShift;
    private double workerPayRate;

    public BasicWorker(String employeeName, int employeeID, int workerShift, double workerPayRate) {
        super(employeeName, employeeID);
        this.workerShift = workerShift;
        this.workerPayRate = workerPayRate;
    }

    @Override
    public double calcPay(int numberOfHours) {
        return this.workerPayRate * numberOfHours;
    }

    public void setWorkerShift(int workerShift) {
        this.workerShift = workerShift;
    }

    public void setWorkerPayRate(double workerPayRate) {
        this.workerPayRate = workerPayRate;
    }

    public int getWorkerShift() {
        return this.workerShift;
    }

    public double getWorkerPayRate() {
        return this.workerPayRate;
    }

}
