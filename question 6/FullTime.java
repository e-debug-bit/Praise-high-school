import java.util.Scanner;

public class FullTime extends Staff {

    private double salary;
    private double netSalary;

    // Assume statutory deductions are 10%
    private final double deductionRate = 0.10;

    // Constructor
    public FullTime(String staffNo, String staffName,
                    int staffAge, double salary) {

        super(staffNo, staffName, staffAge);
        this.salary = salary;
        this.netSalary = salary - (salary * deductionRate);
    }

    // Getter methods
    public double getSalary() {
        return salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    // Override the superclass method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Basic Monthly Salary: $" + salary);
        System.out.println("Monthly Net Salary: $" + netSalary);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== FULL-TIME STAFF ===");

        System.out.print("Enter Staff Number: ");
        String staffNo = input.nextLine();

        System.out.print("Enter Staff Name: ");
        String staffName = input.nextLine();

        System.out.print("Enter Staff Age: ");
        int staffAge = input.nextInt();

        System.out.print("Enter Monthly Basic Salary: ");
        double salary = input.nextDouble();

        FullTime staff = new FullTime(
                staffNo, staffName, staffAge, salary
        );

        System.out.println("\n=== STAFF DETAILS ===");

        // Call the overridden method
        staff.displayDetails();

        input.close();
    }
}
