package org.example.codes;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number%10;
            sum = sum+digit;
            number = number/10;

        }
        System.out.println(originalNumber+ " "+ sum);

    }

}
