package org.example.codes;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i =3;  i <= Math.sqrt(number); i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number= input.nextInt();
        if (isPrime(number)) {
            System.out.println("The number is prime: " + number);
        } else {
            System.out.println("The number not is prime: " + number);

        }
    }
}
