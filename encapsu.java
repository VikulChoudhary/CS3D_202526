package Encapsulation;

import java.lang.reflect.Field;

class Employee {
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary is negative");
        }
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class encapsu {
    public static void main(String[] args) {
        System.out.println("Hello");
        Employee emp = new Employee();
        emp.setSalary(50000);

        try {
            Field salary = Employee.class.getDeclaredField("salary");
            salary.setAccessible(true);
            System.out.println(salary.get(emp));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(emp.getSalary());
    }
}
