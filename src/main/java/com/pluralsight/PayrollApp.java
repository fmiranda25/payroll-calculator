package com.pluralsight;

import java.util.Scanner;

public class PayrollApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your hours worked:");
        float hoursWorked = input.nextFloat();

        System.out.println("Enter your hourly pay:");
        float payRate = input.nextFloat();

        float grossPay;
        if (hoursWorked > 40) {
            grossPay = (((hoursWorked - 40) * payRate) * 1.5f) + (payRate * 40);
        } else {
            grossPay = hoursWorked * payRate;
        }

        System.out.printf("%s has earned $%.2f working %.2f hours this week at $%.2f an hour", name, grossPay, hoursWorked, payRate);

    }
}
