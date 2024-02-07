// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;

class Lab3 {
    //Initialize balance
    private double balance;

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
            balance-=amount;
        }
        else {
            //Output error message
            System.out.println("Sorry, you have insufficient funds for this withdraw.");
        }
    }
    public String menuOption() {
        System.out.println();
    }
    //1. Loop until user generated string is a valid option of four options (deposit, check balance, withdraw, or leave)
    //
    //Check Number:
    //1. Loop until user generated number is a valid and positive number
    //
    //Receipt option:
    //1. Loop until user generated string is either printed or emailed
    public static void main(String[] args) {



    }
}
