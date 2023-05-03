
//violates SRP bcz the class have a lot of responsibilities.
public class EmployeeViolatingSRP {
    private String name;
    private int age;
    private String address;
    private double salary;

    public void save() {
        // Save employee data to a database
    }

    public void calculateSalary() {
        // Calculate employee's salary based on various factors
    }

    public void generatePaySlip() {
        // Generate pay slip for the employee
    }

    public void printEmployeeDetails() {
        // Print employee details
    }
}

