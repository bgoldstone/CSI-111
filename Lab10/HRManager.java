import java.util.Scanner;

public class HRManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many employees are there? ");
        Employee[] employees = new Employee[scan.nextInt()];
        String choice;
        String name;
        int id;
        int levelShift;
        double payRate;
        for (int i = 0; i < employees.length; i++) {
            System.out.print("What type of user would you like? (Supervisor/Worker)");
            choice = scan.nextLine();
            System.out.println();
            while (!(choice.equalsIgnoreCase("Supervisor")) && !(choice.equalsIgnoreCase("Worker"))) {
                System.out.print("Invalid user!\nWhat type of user would you like? (Supervisor/Worker)");
                choice = scan.nextLine();
                System.out.println();
            }
            if (choice.equalsIgnoreCase("Supervisor")) {
                System.out.print("What is the employee's name? ");
                name = scan.nextLine();
                System.out.printf("\nWhat is %S's ID number? ", name);
                id = scan.nextInt();
                System.out.printf("\nWhat is %S's supervisor level? ", name);
                levelShift = scan.nextInt();
                System.out.printf("\nWhat is %S's pay rate? ", name);
                payRate = scan.nextInt();
                employees[i] = new Supervisor(name, id, levelShift, payRate);
            } else if (choice.equalsIgnoreCase("Worker")) {
                System.out.print("What is the employee's name? ");
                name = scan.nextLine();
                System.out.printf("\nWhat is %S's ID number? ", name);
                id = scan.nextInt();
                System.out.printf("\nWhat is %S's shift number? (1 for day shift, 2 for night shift)", name);
                levelShift = scan.nextInt();
                System.out.printf("\nWhat is %S's pay rate? ", name);
                payRate = scan.nextInt();
                employees[i] = new BasicWorker(name, id, levelShift, payRate);
            }
        }
        listEmployees(employees);
        System.out.printf("\nTotal pay: %.2f", calcTotalPay(employees));
    }

    private static double calcTotalPay(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calcPay(40);
        }
        return total;
    }

    private static void listEmployees(Employee[] employees) {
        BasicWorker worker;
        Supervisor supervisor;
        String shift = "";
        for (Employee employee : employees) {
            System.out.println("\n");
            if (employee instanceof BasicWorker) {
                worker = (BasicWorker) employee;
                System.out.printf("Name: %S", worker.getEmployeeName());
                System.out.printf("\nID: %d", worker.getEmployeeID());
                System.out.printf("\nPay Rate: %.2f", worker.getWorkerPayRate());
                if (worker.getWorkerShift() == 1) {
                    shift = "Day Shift";
                }
                if (worker.getWorkerShift() == 2) {
                    shift = "Night Shift";
                }
                System.out.printf("\nShift: %S", shift);

            }
            if (employee instanceof Supervisor) {
                supervisor = (Supervisor) employee;
                System.out.printf("Name: %S", supervisor.getEmployeeName());
                System.out.printf("\nID: %d", supervisor.getEmployeeID());
                System.out.printf("\nPay Rate: %.2f", supervisor.getSupervisorPayRate());
                System.out.printf("\nLevel: %d", supervisor.getSupervisorLevel());
            }
        }
    }
}
