// Programmers: Claudia and Sean
// Course:  CS 212
// Due Date: Feb 11, 2024
// Lab Assignment: Lab 3
// Problem Statement: This program acts as a virtual ATM Machine, which prompts the user with various banking options.
// Data In: Name of the user and the amount they want to deposit/withdraw/check/leave.
// Data Out: Confirmation message for the deposit indicating the deposited amount and updated balance after the deposit.
// Credits: Class notes #4,5

import java.util.Scanner;
import java.text.DecimalFormat;



class Lab3 {

    //Initialize balance
    private double balance;
    Scanner input = new Scanner(System.in);

    public Lab3() {
        //Initialize balance as 212.9
        balance = 212.9;
    }

    public void deposit(double amount) {
        //Add user generated number to balance
        balance += amount;
    }

    public void checkBalance() {
        // Format balance as currency
        DecimalFormat formatter = new DecimalFormat("#.##");
        String formattedBalance = formatter.format(balance);
        // Output current balance
        System.out.println("Current balance: $" + formattedBalance);
    }

    public void withdraw(double amount) {
        //If user generated number is less than or equal to balance
        if (amount <= balance) {
            //Subtract user generated number from balance
            balance -= amount;
        } else {
            //Output error message
            System.out.println("Sorry, you have insufficient funds for this withdraw.");
        }
    }

    public String menuOption() {
        //Prompt user to enter which option they wish to choose
        System.out.println("Please enter what you would like to do (deposit, check, withdraw, or leave)");
        String option = input.nextLine().trim().toLowerCase();
        //Loop until user generated string is a valid option of four options (deposit, check balance, withdraw, or leave)
        while (!option.equals("deposit") && !option.equals("check") && !option.equals("withdraw") && !option.equals("leave")) {
            System.out.println("Invalid option, try again.(deposit, check, withdraw, or leave)");
            option = input.nextLine().trim().toLowerCase();
        }
        return option;
    }

    public double checkNumber(double number) {
        //Loop until user generated number is a valid and positive number
        while (number < 0) {
            System.out.println("Please enter a positive number");
            number = input.nextDouble();
        }
        return number;
    }

    public String receiptOption() {
        //Prompt user to enter which option they wish to choose
        System.out.println("Enter whether you want your receipt emailed or printed (printed or emailed)");
        String option = input.nextLine().trim().toLowerCase();
        //Loop until user generated string is printed or emailed
        while (!option.equals("printed") && !option.equals("emailed")) {
            System.out.println("Invalid option, try again. (printed or emailed)");
            option = input.nextLine().trim().toLowerCase();
        }
        return option;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Welcome message
        System.out.println("Welcome to the Bank Program!");
        System.out.println("This program allows you to perform various banking operations.");

        // Prompt user for their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Create Lab3 object to represent the bank account
        Lab3 bank = new Lab3();

        // Get initial action choice from user
        String option = bank.menuOption();
        // Loop until user chooses to leave
        while (!option.equals("leave")) {
            switch (option) {
                case "deposit":
                    System.out.print("Enter the amount you are planning to deposit: ");
                    // Prompt user for deposit amount
                    double depositAmount = bank.checkNumber(scanner.nextDouble());
                    bank.deposit(depositAmount);
                    break;
                case "check":
                    // Display current balance
                    bank.checkBalance();
                    break;
                case "withdraw":
                    System.out.print("Enter the amount you are planning to withdraw: ");
                    // Prompt user for withdrawal amount
                    double withdrawAmount = bank.checkNumber(scanner.nextDouble());
                    bank.withdraw(withdrawAmount);
                    break;
            }
            option = bank.menuOption();
        }
        // Get receipt option from user
            String receiptOption = bank.receiptOption();
            System.out.println("Your receipt will be " + receiptOption);
            System.out.println(name + " ,thank you for using the Bank Program. Goodbye!");
        }
    }





