/*
* UCF COP 3330 Fall 2021 Assignment 12 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the principal: ");
        Scanner interest = new Scanner(System.in);
        double principal = interest.nextFloat();
        System.out.println("Enter the rate of interest: ");
        double rate = interest.nextFloat();
        double rate_2 = rate;
        rate=rate/100;
        System.out.println("Enter the number of years: ");
        int years = interest.nextInt();

        double amount = principal * (1 + (rate*years));
        amount = Math.round(amount);

        int amount_2 = (int) amount;

        System.out.printf("After %d years at %.1f investment, the investment will be worth $%d", years, rate_2, amount_2);
    }
}