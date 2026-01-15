package src.methods;

//create a program to sum all odd numbers from 1 to a specified number N

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Odd / Even world.");
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till " + num + " is: " + sum);
    }

    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
         return sum;
    }
}
