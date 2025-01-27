package com.employee.app;

import com.employee.core.Employee;
import com.employee.data.EmployeeRepository;
import com.employee.logging.LoggerUtil;
import org.slf4j.Logger;

import java.util.List;

public class Main {
    private static final Logger logger = LoggerUtil.getLogger();

    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        // Add employees
        Employee emp1 = new Employee(1, "Alice", 30, "HR");
        Employee emp2 = new Employee(2, "Bob", 28, "Engineering");

        System.out.println("\nGetting Details of Employee 2 --> ");

        String detailsOfEmp = emp2.getAllDetails();
        System.out.println(detailsOfEmp);
        logger.info("Employee 2 get all details run successfully");

        System.out.println("Details Fetched Successfully!!!\n");

        repository.addEmployee(emp1);
        repository.addEmployee(emp2);

        logger.info("Employees added.");

        System.out.println("Employees added.");
        System.out.print("Employees : "+repository);

        // Retrieve employee 1
        Employee retrievedEmp = repository.getEmployees(1);
        logger.info("Retrieved Employee: " + retrievedEmp);
        System.out.print("Retrieved Employee : "+retrievedEmp);

        //Retrieve Employee 2 by name
        List<Employee> retrievedEmp2 = repository.getEmployees("Bob");
        logger.info("Retrieved Employee: " + retrievedEmp2);
        System.out.print("Retrieved Employee2 : "+retrievedEmp2);

        // Update employee
        Employee updatedEmp = new Employee(1, "Alice", 31, "HR");
        repository.updateEmployee(1, updatedEmp);
        logger.info("Employee updated.");
        System.out.println("Employees updated.");


        System.out.println("Program Terminated !!!");
    }
}
