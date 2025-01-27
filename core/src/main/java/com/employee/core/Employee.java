package com.employee.core;

public class Employee {
    //can use String for ID, but I am using int here.
    private int id;
    private String name;
    private int age;
    private String department;

    public Employee(int id, String name, int age, String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    //Getters and Setters :


    //For ID -->
    //Getter for ID:
    public int getId(){
        return id;
    }

    //Setter for ID:
    public void setId(int id){
        this.id = id;
    }

    //For Name -->
    //Getter for Name :
    public String getName(){
        return name;
    }

    //Setter for Name :
    public void setName(String name){
        this.name = name;
    }

    //For Age -->
    //Getter for Age :
    public int getAge(){
        return age;
    }

    //Setter for Age :
    public void setAge(int age){
        this.age = age;
    }

    //For Department -->
    //Getter for Department:
    public String getDepartment(){
        return department;
    }

    //Setter for Department:
    public void setDepartment(String department){
        this.department = department;
    }


    //Method to get all details of an Employee:
    public String getAllDetails(){
        return "Employee :" +
                " [ id : "+id+
                ", name : "+name+
                ", age : "+age+
                ", department : "+department+"]";
    }

    public static void main(String[] args){
        System.out.println("Inside Core !!");
    }
}