package org.example.codes;

import java.util.Scanner;

/*% - remeder
/ - answer*/
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number= input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even: " + number);
        } else {
            System.out.println("The number is odd: "+number);
        }
    }
}
