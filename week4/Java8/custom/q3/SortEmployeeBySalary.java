package week4.Java8.custom.q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of Employee objects, sort the list based on employee salary. Assume Employee class having id, name, salary fields.
public class SortEmployeeBySalary {
    
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23, "Praj", 2345121));
        employees.add(new Employee(23, "Joey", 23583412));
        employees.add(new Employee(1, "Monica", 323404944));
        employees.add(new Employee(24, "Gunther", 323404945));
        employees.add(new Employee(22, "Ross", 24569431));

        Stream<Employee> employeeStream = employees.stream();

        System.out.println(employeeStream.sorted(new sortBySalary()).collect(Collectors.toList()));
        //System.out.println(employeeStream.sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).collect(Collectors.toList()));
        //System.out.println(employeeStream.sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList()));

    }
}

class Employee {
    private Integer id;
    public String name;
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

    @Override
    public String toString() {
        return "Employee " + this.name + " & Salary: " + this.salary;
    }
}

class sortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}
