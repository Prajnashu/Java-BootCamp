
//The class representing an employee have one responsibility to calculateTheSalary. Salary calculation is the most important part for an employee so this class have that responsibility.
public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void calculateSalary() {
        if (department.equals("Engineering")) {
            salary += salary * 0.1;
        } else if (department.equals("Marketing")) {
            salary += salary * 0.15;
        }
    }
}

