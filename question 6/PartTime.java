import java.util.Scanner;

public class PartTime extends Staff {

    private final double hourlyRate = 10.0;
    private int hoursWorked;
    private double grossPay;
    private double tax;
    private double netPay;

    // Constructor
    public PartTime(String staffNo, String staffName,
                    int staffAge, int hoursWorked) {

        super(staffNo, staffName, staffAge);

        this.hoursWorked = hoursWorked;

        grossPay = hoursWorked * hourlyRate;
        tax = grossPay * 0.30;
        netPay = grossPay - tax;
    }

    // Getter methods
    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getTax() {
        return tax;
    }

    public double getNetPay() {
        return netPay;
    }

    // Override the superclass method
    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Gross Monthly Pay: $" + grossPay);
        System.out.println("Tax (30%): $" + tax);
        System.out.println("Net Monthly Pay: $" + netPay);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PART-TIME STAFF ===");

        System.out.print("Enter Staff Number: ");
        String staffNo = input.nextLine();

        System.out.print("Enter Staff Name: ");
        String staffName = input.nextLine();

        System.out.print("Enter Staff Age: ");
        int staffAge = input.nextInt();

        System.out.print("Enter Total Hours Worked This Month: ");
        int hoursWorked = input.nextInt();

        PartTime staff = new PartTime(
                staffNo, staffName, staffAge, hoursWorked
        );

        System.out.println("\n=== STAFF DETAILS ===");

        // Call the overridden method
        staff.displayDetails();

        input.close();
    }
}
