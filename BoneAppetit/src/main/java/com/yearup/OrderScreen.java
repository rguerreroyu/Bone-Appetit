package com.yearup;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class OrderScreen {
    public static void Loading(String message) {

        System.out.println("\n" + message);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
