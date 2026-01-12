package src.inputs;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to sum problem! ");
        System.out.println("please, enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("enter your second number: ");
        int num2 = input.nextInt();
        System.out.println("Answer is: " + (num1 + num2));
    }
}
