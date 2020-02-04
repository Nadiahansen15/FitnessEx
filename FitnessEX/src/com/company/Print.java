package com.company;

import java.util.ArrayList;

public class Print {

    PersonCreator personCreator = new PersonCreator();

    public void printEmployee(){


        System.out.println("*** FITNESS EMPLOYEE ***");
        System.out.printf("%-15s", "Name");
        System.out.printf("%-20s", "CPR");
        System.out.printf("%-10s", "hours");
        System.out.printf("%-15s", "Salary");
        System.out.printf("%-15s", "Vacation");
        System.out.println();
        System.out.println("****************************************************************************");


        for (Employee employee:personCreator.employees()) {
        System.out.printf("%-15s", employee.getName());
        System.out.printf("%-20s", employee.getCpr());
        System.out.printf("%-10s", employee.getHours());
        System.out.printf("%-15s", employee.getSalary());
        System.out.printf("%-15s", employee.getVacation());

        System.out.println();
    }
        System.out.println("****************************************************************************"+'\n');



}

        public void printMember(){

            System.out.println("*** MEMBERS ***");
            System.out.printf("%-15s", "Name");
            System.out.printf("%-15s", "CPR");
            System.out.printf("%-15s", "Membertype");
            System.out.printf("%-15s", "Fee");
            System.out.println();
            System.out.println("****************************************************************************");

            for (Member member1:personCreator.Members()) {
                System.out.printf("%-15s", member1.getName());
                System.out.printf("%-15s", member1.getCpr());
                System.out.printf("%-15s", member1.getMemberType());
                System.out.printf("%-15s", member1.monthlyFee());
                System.out.println();
            }
            System.out.println("****************************************************************************"+'\n');



        }

    public void printPerson() {
        System.out.println("*** EMPLOYEES & MEMBERS Name and Cpr ***");
        System.out.printf("%-15s", "Name");
        System.out.printf("%-15s", "CPR");
        System.out.println();
        System.out.println("****************************************************************************");

        for (Member member : personCreator.Members()) {
            System.out.printf("%-15s", member.getName());
            System.out.printf("%-15s", member.getCpr());
            System.out.println();
        }
        for (Employee employee : personCreator.employees()) {
            System.out.printf("%-15s", employee.getName());
            System.out.printf("%-15s", employee.getCpr());
            System.out.println();
        }
        System.out.println("****************************************************************************"+'\n');


    }



}


