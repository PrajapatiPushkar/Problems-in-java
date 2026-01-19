package src.ternaryandswitch;

//Create a program to find the minimum of two numbers.

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minimum checker\n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        Problem1 problem1 = new Problem1();
        int min = problem1.min(num1, num2);
        System.out.println("Minimum number is: " + min);


    }

    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
}