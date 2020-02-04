package com.company;

public class Employee extends Person{

    private int hours;
    private int salary;
    private boolean vacation;

    public Employee(String name, String cpr, int hours, int salary, boolean vacation) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
        this. vacation = vacation;
    }

    public Employee() {
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        if (hours == 37) {
            return 23000;
        }
        else {
            salary = salary * hours;
            return salary;
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVacation() {
        if (vacation) {
            return 5;
        }
        else
        {
            return 0;
        }
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

}
