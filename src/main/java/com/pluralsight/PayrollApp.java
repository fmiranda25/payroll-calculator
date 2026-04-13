package com.pluralsight;

import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = inputName.nextLine();

        Scanner inputHoursWorked = new Scanner(System.in);
        System.out.println("Enter your hours worked:");
        float hoursWorked = inputHoursWorked.nextFloat();

        Scanner inputPayRate = new Scanner(System.in);
        System.out.println("Enter your hourly pay:");
        float payRate = inputPayRate.nextFloat();

        float grossPay = 0f;
        if (hoursWorked > 40) {
            grossPay = (((hoursWorked - 40) * payRate) * 1.5f) + (payRate * 40);
        } else {
            grossPay = hoursWorked * payRate;
        }

        System.out.printf("%s has earned $%.2f working %.2f hours this week at $%.2f an hour", name, grossPay, hoursWorked, payRate);

    }
}
