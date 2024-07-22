package org.example.codes;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int reverse = 0;
        while (number != 0) {
        int digit = number%10;
        reverse = reverse*10+digit;
        number = number/10;

        }
        if (originalNumber == reverse) {
            System.out.println("The numeber is pallindrome: " + originalNumber);
        } else {
            System.out.println("The numeber is not  pallindrome: " + originalNumber);

        }

    }
}
