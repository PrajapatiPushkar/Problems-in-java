package src.loops;

//create a program that determines if a number is odd or even.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("welcome to odd/even identifier ");
        System.out.println("please enter your number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("your number is even.");
        } else {
            System.out.println("your number is odd.");
        }

    }
}
