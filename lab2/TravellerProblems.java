package com.greatlearning.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class TravellerProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of currency denominations: ");
        int n = input.nextInt();
        int[] denominations = new int[n];
        System.out.print("Enter the currency denominations value: ");
        for (int i = 0; i < n; i++) {
            denominations[i] = input.nextInt();
        }
        System.out.print("Enter the amount you want to pay: ");
        int amount = input.nextInt();
        Arrays.sort(denominations);
        int[] notes = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            notes[i] = amount / denominations[i];
            amount = amount % denominations[i];
        }
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = n - 1; i >= 0; i--) {
            if (notes[i] != 0) {
                System.out.println(denominations[i] + ":" + notes[i]);
            }
        }
        input.close();
    }
}

