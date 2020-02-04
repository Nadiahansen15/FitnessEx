package com.company;

public class Instructor extends Employee {

    private int salary;

    public Instructor(String name, String cpr, int hours, int salary, boolean vacation) {
        super(name, cpr, hours, salary, vacation);
    }

    public int getsalary() {
        return salary;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }



}

