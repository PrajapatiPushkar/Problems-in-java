package src.swap;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Welcome to Swaping of numbers: ");
        Scanner input =  new Scanner(System.in);
        System.out.println("enter your first number: ");
        int firstNum = input.nextInt();
        System.out.println("enter your second number: ");
        int secondNum = input.nextInt();

        int thirdNum = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;

        System.out.println("Swapping done....");
        System.out.println("Value of first number is: " + firstNum);
        System.out.println("Value of seconf number is: " + secondNum);
    }
}
