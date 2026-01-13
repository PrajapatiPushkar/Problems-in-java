package src.loops;

//create a problem that determines if a number is positive, negative, or zero.

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number identifier.");
        System.out.println("enter your number: ");
        int num = input.nextInt();
        
        if (num == 0){
            System.out.println("your number is zero.");
        } else if (num > 0 ) {
            System.out.println("your number is positive.");
        } else {
            System.out.println("your number is negative.");
        }
    }
}
