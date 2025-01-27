package com.employee.data;

import com.employee.core.Employee;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository {
    private List<Employee>employees;


    //Constructor for initialising the employees list as arrayList:
    public EmployeeRepository(){
        this.employees = new ArrayList<>();
    }

    //Method to add an employee:
    public void addEmployee(Employee employee){
        employees.add(employee);

        System.out.println("Employee Added : "+employee);
    }


    //Demonstration of Method Overloading based on different Parameters -->

    //Method to get an employee by its ID:
    public Employee getEmployees(int id){
        // 1.Run a for loop, and for every Employee,
        // 2. check if its id is equal to the given id.
        // 3. If yes, return that employee
        // 4. Otherwise , after full traversal of employees list, return null.
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    //Method to get employee or list of employees with given name:
    public List<Employee> getEmployees(String name){
        // 1. Create an empty matchedEmployees ArrayList that will be used to store the matched results.
        // 2. Iterate over the employees list
        // 3. If the name matches, add it in the matchedEmployees.
        // 4. After complete traversal, return the matchedEmployees.

        List<Employee>matchedEmployees = new ArrayList<>();

        for(Employee employee : employees){
            if(employee.getName().equalsIgnoreCase(name)){
                matchedEmployees.add(employee);
            }
        }
        return matchedEmployees;
    }

    //Method to get list of employees with given age
    public List<Employee> getEmployeesByAge(int age){
        // 1. Create an empty result ArrayList that will store the matched results.
        // 2. Iterate over the employees list.
        // 3. If the Age is exactly equal to the given age, add it in the result.
        // 4. After the complete traversal of employees list, return result.

        List<Employee>matchedEmployees = new ArrayList<>();
        for(Employee employee : employees){
            if(employee.getAge() == age){
                matchedEmployees.add(employee);
            }
        }
        return matchedEmployees;
    }

    //Method to get a list of employees with given age range i.e. minAge and maxAge:
    public List<Employee> getEmployeesByAge(int minAge, int maxAge){
        // 1. Create an empty result ArrayList that will store the matched results.
        // 2. Iterate over the employees list.
        // 3. Check if the employee age is greater than or equal to minAge and less than or equal to maxAge.
        // 4. If yes, add it in your result.
        // 5. After complete employees list traversal, return the result.

        List<Employee>matchedEmployees = new ArrayList<>();
        for(Employee employee : employees){
            int employeeAge = employee.getAge();
            if(employeeAge >= minAge && employeeAge <= maxAge){
                matchedEmployees.add(employee);
            }
        }
        return matchedEmployees;
    }

    //Method to get a list of employees with a given department:
    public List<Employee> getEmployeesByDepartment(String department){
        // 1. Create an empty result ArrayList that will store the matched results.
        // 2. Iterate over the complete employees list.
        // 3. If the department of employee matches the given department, add it in your result.
        // 4. After complete traversal, return the result list.

        List<Employee>matchedEmployees = new ArrayList<>();
        for(Employee employee : employees){
            if(employee.getDepartment().equalsIgnoreCase(department)){
                matchedEmployees.add(employee);
            }
        }
        return matchedEmployees;
    }

    //Method to update any employee given its id and new employee data:
    public boolean updateEmployee(int id, Employee updatedEmployee){
        int sizeOfEmployeesList = employees.size();
        for(int i=0;i<sizeOfEmployeesList;i++){
            if(employees.get(i).getId() == id){
                employees.set(i, updatedEmployee);
                System.out.println("Employee Id :"+id+" Updated : "+updatedEmployee);
                return true;
            }
        }
        System.out.println("Employee Not Found : "+id);
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Inside Employee Repository!!");
    }
}