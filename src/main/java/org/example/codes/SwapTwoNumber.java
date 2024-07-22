package org.example.codes;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter the number2: ");
        int number2 = input.nextInt();

        System.out.println("Numbers before swapping: "+ number1 +" "+ number2);
       /* num1 =10, 30
        num2 =20 ,10

        */
        number1 = number1+number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("Numbers after swapping: "+ number1 +" "+ number2);
    }
}
