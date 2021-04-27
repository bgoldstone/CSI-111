import java.util.Scanner;

/**
 * Manages Employees
 */
public class HRManager {
    public static void main(String[] args) {
        //Variable and Object declaration/initialization.
        Scanner scan = new Scanner(System.in);
        String choice;
        String name;
        int id;
        int levelShift;
        double payRate;

        //Prompts users for how many employees are there.
        System.out.print("How many employees are there? ");
        //New Array of Employees
        Employee[] employees = new Employee[scan.nextInt()];
        scan.nextLine();

        //Initializes Employees based on type.
        for (int i = 0; i < employees.length; i++) {
            System.out.print("What type of user would you like? (Supervisor/Worker) ");
            choice = scan.nextLine();
            System.out.println();

            //If invalid type, keep prompting user until correct input is given.
            while (!(choice.equalsIgnoreCase("Supervisor")) && !(choice.equalsIgnoreCase("Worker"))) {
                System.out.print("Invalid user!\nWhat type of user would you like? (Supervisor/Worker) ");
                choice = scan.nextLine();
                System.out.println();
            }

            //If supervisor, get supervisor information.
            if (choice.equalsIgnoreCase("Supervisor")) {
                System.out.print("What is the employee's name? ");
                name = scan.nextLine();
                System.out.printf("%nWhat is %s's ID number? ", name);
                id = scan.nextInt();
                scan.nextLine();
                System.out.printf("%nWhat is %s's pay rate? ", name);
                payRate = scan.nextDouble();
                scan.nextLine();
                System.out.printf("%sWhat is %s's supervisor level? ", name);
                levelShift = scan.nextInt();
                scan.nextLine();
                employees[i] = new Supervisor(name, id, levelShift, payRate);
            }

            //If Worker, get worker information.
            if (choice.equalsIgnoreCase("Worker")) {
                System.out.print("What is the employee's name? ");
                name = scan.nextLine();
                System.out.printf("%sWhat is %s's ID number? ", name);
                id = scan.nextInt();
                scan.nextLine();
                System.out.printf("%sWhat is %s's pay rate? ", name);
                payRate = scan.nextDouble();
                scan.nextLine();
                System.out.printf("%sWhat is %s's shift number? (1 for day shift, 2 for night shift) ", name);
                levelShift = scan.nextInt();
                scan.nextLine();
                employees[i] = new BasicWorker(name, id, levelShift, payRate);
            }
            System.out.println();
        }
        //Lists all employees.
        listEmployees(employees);

        //Prints total pay for all employees
        System.out.printf("%s%sTotal pay: %,.2f", calcTotalPay(employees));
    }

    /**
     * Calculates total pay
     *
     * @param employees array of Employees
     * @return double total pay for all employees
     */
    private static double calcTotalPay(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calcPay(40);
        }
        return total;
    }

    /**
     * Lists all employees.
     *
     * @param employees array of Employees
     */
    private static void listEmployees(Employee[] employees) {
        BasicWorker worker;
        Supervisor supervisor;
        String shift = "";
        for (Employee employee : employees) {
            System.out.println("\n");
            //If worker, cast to worker and print information.
            if (employee instanceof BasicWorker) {
                worker = (BasicWorker) employee;
                System.out.printf("Name: %s", worker.getEmployeeName());
                System.out.printf("%sID: %d", worker.getEmployeeID());
                System.out.printf("%sPay Rate: $%,.2f", worker.getWorkerPayRate());
                if (worker.getWorkerShift() == 1) {
                    shift = "Day Shift";
                }
                if (worker.getWorkerShift() == 2) {
                    shift = "Night Shift";
                }
                System.out.printf("%sShift: %s", shift);

            }
            //If supervisor, cast to worker and print information.
            if (employee instanceof Supervisor) {
                supervisor = (Supervisor) employee;
                System.out.printf("Name: %s", supervisor.getEmployeeName());
                System.out.printf("%sID: %d", supervisor.getEmployeeID());
                System.out.printf("%sPay Rate: %,.2f", supervisor.getSupervisorPayRate());
                System.out.printf("%sLevel: %d", supervisor.getSupervisorLevel());
            }
        }
    }
}
