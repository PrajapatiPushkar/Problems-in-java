package src.methods;

//create a program that prints the multiplication table for a given number.

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to multiplication table");
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        printMultiplication(num);
    }
    public static void printMultiplication(int num){
       int i = 1;
       while (i <= 10) {
           System.out.println(num + " X " + i + " = " + (num * i));
           i++;
       }
    }
}
