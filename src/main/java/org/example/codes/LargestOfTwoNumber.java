package org.example.codes;

import java.util.Scanner;

public class LargestOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();

        System.out.println("Enter the number3: ");
        int number3 = input.nextInt();

        if (number1 > number2 && number1> number3) {
            System.out.println("The Largest number is: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The Largest number is: " + number2);

        } else if (number3 > number1 && number3 > number2) {
            System.out.println("The Largest number is: " + number3);
        } else {
            System.out.println("All are eqaul: ");
        }

    }
}
