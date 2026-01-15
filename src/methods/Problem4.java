package src.methods;

//create a program that computes the sum of the digits og an integer.

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of the digit.");
        System.out.print("Enter your digit: ");
        int num = input.nextInt();
        int sum = sumDigit(num);
        System.out.println("Sum of Digits is: " + sum);
    }

    public static int sumDigit(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
