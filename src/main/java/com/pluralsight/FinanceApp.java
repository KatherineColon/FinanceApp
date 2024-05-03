package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FinanceApp {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> transactions = new ArrayList<>();

        while (true) {
        //Home Screen
        System.out.println("Welcome to the Home Screen!");
        System.out.println("D: Add deposit ");
        System.out.println("P: Make a payment ");
        System.out.println("L: Ledger ");
        System.out.println("X: Exit the app ");
        System.out.println("Please select an option: ");
        String option = scanner.nextLine().toUpperCase();

        switch (option){
            case "D":
                deposit();
                break;
            case "P":
                payment();
                break;
            case "L":
                ledger();
                break;
            case "X":
                exit();
                System.exit(0);
            default:
                System.out.println("Please enter a valid character.");

        }


    }//methods

}
    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("transactions.csv");
            BufferedWriter bufWriter = new BufferedWriter(writer);

            System.out.println("Please enter the deposit info (amount, description, vendor): ");
            String depositInfo = scanner.nextLine();
            bufWriter.write(depositInfo);
            bufWriter.newLine();

            System.out.println("Deposit added successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ledger(){


        System.out.println("Ledger:");
        System.out.println("A) All");
        System.out.println("D) Deposits");
        System.out.println("P) Payments");
        System.out.println("R) Reports");
        System.out.println("0) Back Home");
        System.out.print("Choose an option: ");
    }
