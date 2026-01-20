package src.loopandswitch;

//display the fibonacci series using recursion

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing fibonacci series");
        System.out.print("Enter the number of elements to be printed: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position) {
        System.out.print(".");
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1) +
                fibonacci(position - 2);
    }
}
