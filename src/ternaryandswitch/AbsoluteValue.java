package src.ternaryandswitch;

//Create a program to calculate the absolute value of a given integer.

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to calculate absolute value\n");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println(result + " is the absolute integer.");
    }
}
