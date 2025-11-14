package com.yearup;
import java.util.Scanner;

public class HomeScreen {

    public static void Loading(String message) {

        System.out.println("\n" + message);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    public void ShowHomeScreen() {
        //options list = new optionslist();
        //list.loadFromCsv("transaction.csv");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {




            Loading ("Choose an option:");

            System.out.println("1. Place an order!");
            System.out.println("=====================");

            System.out.println("0. Exit");
            System.out.println("=====================");

            System.out.print("Pick here: ");

            String choice = scanner.nextLine().toLowerCase();
            switch (choice) {

                case "1" :
                    System.out.println("\n\n====Place holder ====");
                    YogurtTreat yogurtTreat = new YogurtTreat();
                    yogurtTreat.addYogurt();

                    break;


                case "0" :
                    System.out.println("Goodbye, Thank you!");
                    System.exit(0);
                    break;
                }


//                default -> System.out.println("Invalid choice, try again!");
            }
        }

    }
