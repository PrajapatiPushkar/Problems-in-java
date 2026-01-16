package src.methods;

//create a program to reverse of the digit of a number

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the reverse of the digit.");
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        int reverse = reverse(num);
        System.out.println("reverse of the your number is " + reverse);
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
