public class Staff {
    private String staffNo;
    private String staffName;
    private int staffAge;

    // Constructor
    public Staff(String staffNo, String staffName, int staffAge) {
        this.staffNo = staffNo;
        this.staffName = staffName;
        this.staffAge = staffAge;
    }

    // Getter methods
    public String getStaffNo() {
        return staffNo;
    }

    public String getStaffName() {
        return staffName;
    }

    public int getStaffAge() {
        return staffAge;
    }

    // Display details method
    public void displayDetails() {
        System.out.println("Staff Number: " + staffNo);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Age: " + staffAge);
    }
}