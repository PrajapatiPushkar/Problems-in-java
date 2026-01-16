package src.methods;

import java.util.Scanner;

//Create a program to print the fibonacci series up to a certain number.
public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fibonacci series ");
        System.out.print("please enter your number up to which series ahs to be printed: " );
        int num = input.nextInt();
        System.out.print("here is the fibonacci series: ");
        printFibonacci(num);
    }

    public static void printFibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
