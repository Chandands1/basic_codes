package org.example.codes;

import java.awt.*;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();

        System.out.println("the sum is: "+(number1/number2));

    }
}
