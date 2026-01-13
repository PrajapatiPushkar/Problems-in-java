package src.loops;

//create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number checker.");
        System.out.println("please, enter your number one by one: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 > num3) {
            System.out.println(num1 + " first number is greatest number." );
        } else if (num2 >= num3 ) {
            System.out.println(num2 + " second number is greatest number.");
        }else {
            System.out.println(num3 + " third number is greatest number. ");
        }
    }
}
