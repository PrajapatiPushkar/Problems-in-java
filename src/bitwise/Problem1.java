package src.bitwise;

//create  a program that shows bitwise AND of two number.

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise operator");
        System.out.println("please enter the first number");
        int first = input.nextInt();
        System.out.println("enter the other number");
        int second = input.nextInt();

        int result =  first & second;
        System.out.println("result is: " + result);
    }
}
