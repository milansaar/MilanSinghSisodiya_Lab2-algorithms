package com.greatlearning.lab2;

import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of transaction array: ");
        int n = input.nextInt();
        int[] transactions = new int[n];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < n; i++) {
            transactions[i] = input.nextInt();
        }
        System.out.print("Enter the total no of targets that needs to be achieved: ");
        int noOfTargets = input.nextInt();
        for (int i = 0; i < noOfTargets; i++) {
            System.out.print("Enter the value of target: ");
            int target = input.nextInt();
            int sum = 0;
            int j;
            for (j = 0; j < n; j++) {
                sum += transactions[j];
                if (sum >= target) {
                    System.out.println("Target achieved after " + (j + 1) + " transactions");
                    break;
                }
            }
            if (j == n) {
                System.out.println("Target is not achieved");
            }
        }
        input.close();
    }
}