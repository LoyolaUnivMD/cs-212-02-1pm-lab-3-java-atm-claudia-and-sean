// Programmers: Claudia and Sean
// Course:  CS 212
// Due Date: Feb 
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;


class Lab3 {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the Bank Program!");
        System.out.println("This program allows you to perform various banking operations.");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
    
    //Initialize balance
    private double balance;
    Scanner input = new Scanner(System.in);
    public Lab3() {
        //Initialize balance as 212.9
        balance = 212.9;
    }
    public void deposit(double amount) {
        //Add user generated number to balance
        balance+=amount;
    }
    public void withdraw(double amount) {
        //If user generated number is less than or equal to balance
        if (amount <= balance) {
            //Subtract user generated number from balance
            balance -= amount;
        }
        else {
            //Output error message
            System.out.println("Sorry, you have insufficient funds for this withdraw.");
        }
    }
    public String menuOption() {
        //Prompt user to enter which option they wish to choose
        System.out.println("Please enter what you would like to do (deposit, check, withdraw, or leave)");
        String option = input.nextLine().trim().toLowerCase();
        //Loop until user generated string is a valid option of four options (deposit, check balance, withdraw, or leave)
        while(!option.equals("deposit") && !option.equals("check") && !option.equals("withdraw") && !option.equals("leave")) {
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
        System.out.println("Whether you want your receipt emailed or printed (printed or emailed)");
        String option = input.nextLine().trim().toLowerCase();
        //Loop until user generated string is printed or emailed
        while(!option.equals("printed") && !option.equals("emailed")) {
            System.out.println("Invalid option, try again. (printed or emailed)");
            option = input.nextLine().trim().toLowerCase();
        }
        return option;
    }
    public static void main(String[] args) {



    }
}
