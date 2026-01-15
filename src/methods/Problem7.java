package src.methods;

//Create a program to check whether a given number is prime.

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to checking prime number.");
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        boolean isPrime = isPrimeNumber(num);
        if (isPrime) {
            System.out.println("your number is prime.");
        } else {
            System.out.println("your number is not prime.");
        }


    }

    public static boolean isPrimeNumber(int num){
        int i = 2;
        while (i < num) {
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;

    }
}
