package src.bitwise;

//write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("welcome to Odd/Even calculator");
        System.out.println("enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("your number is odd");
        } else {
            System.out.println("your number is even");
        }
    }
}
