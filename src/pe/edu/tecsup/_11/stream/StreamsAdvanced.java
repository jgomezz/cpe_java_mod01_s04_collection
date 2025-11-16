package pe.edu.tecsup._11.stream;

import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private int salary;

    // Constructor, getters, and setters

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    public String getName() {
        return name;
    }
}


public class StreamsAdvanced {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 3000),
                new Employee("Bob", 4000),
                new Employee("Charlie", 5000));

        // Calculate total salary using reduce()
        int totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);

        System.out.println("Total Salary: " + totalSalary); // Output: Total Salary: 12000
    }
}

