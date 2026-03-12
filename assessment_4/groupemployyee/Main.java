package com.techouts.assessment_4.groupemployyee;
//Write a program to group employees by department and count employees in each
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "IT"),
                new Employee("David", "HR"),
                new Employee("Eve", "Finance")
        );

        // Group by department and count employees
        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,       // key = department
                        Collectors.counting()    // value = count
                ));

        System.out.println(departmentCount);
    }
}