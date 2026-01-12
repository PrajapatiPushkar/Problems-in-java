package src.operator;

import java.util.Scanner;

//create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,%).
public class Problem1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("enter your second number: ");
        int num2 = input.nextInt();
        //use of operators
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        //print the result
        System.out.println("Addition is: " + sum );
        System.out.println("Substraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);

    }
}
