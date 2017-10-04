package com.AdvancedClasses.java;

public class Main {

    public static void main(String[] args) {
        //instantiate 3 employees
        Employee emp1 = new Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1,"02/10/1985");
        Employee emp2 = new Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2,"11/2/2011");
        Employee emp3 = new Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3,"2/11/2014");

        //display output for 3 employees and use calculate method to display their pay for the week
        emp1.display();
        emp1.calculate(45.0);
        emp2.display();
        emp2.calculate(50.0);
        emp3.display();
        emp3.calculate(35.0);
    }
}

