package src.exceptionhandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();


        try {
            int result = first / second;
            System.out.println(result);
        }catch (ArithmeticException exception) {
            System.out.println("Divide by zero, enter valid number!");
        }
    }
}
