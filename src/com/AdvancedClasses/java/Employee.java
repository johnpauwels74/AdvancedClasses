package com.AdvancedClasses.java;

//create Employee class
public class Employee {

    //declare variables
    private String employeeName;
    private PositionTitle employeePosition;
    private Boolean employeeSalary;
    private Double employeePayRate;
    private int employeeShift;
    private String employeeStartDate;

    //instantiate new Employee with all variables
    public Employee(String employeeName, PositionTitle employeePosition, Boolean employeeSalary, Double employeePayRate, int employeeShift, String employeeStartDate) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
        this.employeePayRate = employeePayRate;
        this.employeeShift = employeeShift;
        this.employeeStartDate = employeeStartDate;
    }

    //gets and sets
    public String getEmployeeName() { return employeeName; }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public PositionTitle getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(PositionTitle employeePosition) {
        this.employeePosition = employeePosition;
    }

    public Boolean getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Boolean employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Double getEmployeePayRate() {
        return employeePayRate;
    }

    public void setEmployeePayRate(Double employeePayRate) {
        this.employeePayRate = employeePayRate;
    }

    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }

    public String getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(String employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    //method for calculating pay
    public void calculate(Double hoursIn) {
        Double pay = 0.0;
        Double overtimeHours = 0.0;

        if(hoursIn > 40){
            overtimeHours = hoursIn - 40;
            pay = overtimeHours * (employeePayRate* 1.5);
            hoursIn = 40.0;
        }
        if(employeeShift == 1){
            pay = pay + (hoursIn * employeePayRate);
        }
        else if(employeeShift == 2){
            pay = pay + (hoursIn * (employeePayRate * 1.05));
        }
        else if(employeeShift == 3){
            pay = pay + (hoursIn * (employeePayRate * 1.1));
        }
        //display output for the week's pay for the employee
        System.out.println(employeeName + " earned $" + String.format("%.2f", pay) + " this week");
    }

    //method for displaying information with proper format
    public void display(){
        System.out.println("\n" + "Employee Name: " + employeeName +
                "\n" + employeePosition + " is salary: " + employeeSalary
                + "\nShift: " + employeeShift
                + "\nRate of pay is: $" + String.format("%.2f", employeePayRate) + " per hour");
    }
}