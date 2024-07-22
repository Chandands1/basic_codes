package org.example.codes;

import java.util.Scanner;

public class FibonacciSeries {

    public static void ficonacciSeries(int limit) {
        int number1 = 0;
        int number2 = 1;
        System.out.print("Fibonacci series up to " + limit + " terms: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(number1+" ");

            int next = number1 + number2;
            number1 = number2;
            number2 = next;
        }
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int limit= input.nextInt();
        ficonacciSeries(limit);

    }
}
