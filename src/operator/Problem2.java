package src.operator;
//create a program to calculate product of two floating points numbers.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first floating number: ");
        float f1 = input.nextFloat();
        System.out.println("Enter your second floating number: ");
        float f2 = input.nextFloat();
        float mul = f1 * f2;
        System.out.println("Multiplication is: " + mul);
    }
}
