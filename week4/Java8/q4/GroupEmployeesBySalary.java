package week4.Java8.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of Employee objects, group the list based on employee salary? Assume Employee class having id, name, salary fields.
public class GroupEmployeesBySalary {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23, "Praj", 2345121));
        employees.add(new Employee(23, "Joey", 23583412));
        employees.add(new Employee(45, "Phoebe", 60000031));
        employees.add(new Employee(1, "Monica", 323404944));
        employees.add(new Employee(24, "Gunther", 323404945));
        employees.add(new Employee(22, "Ross", 24569431));

        Stream<Employee> employeeStream = employees.stream();
        Map<String, List<String>> groups = employeeStream.collect(Collectors.groupingBy(s -> s.getSalary() > 50000000 ? "high": "low", Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(groups);
    }
}

class Employee {
    private Integer id;
    private String name;
    private Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Employee " + this.name + " & Salary: " + this.salary;
    }
}