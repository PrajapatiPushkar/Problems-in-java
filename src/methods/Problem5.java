package src.methods;

//Create a program to find the least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to LCM calculator.");
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();

        int lcm = lcm(first, second);
        System.out.println("Lcm of the two number is: " + lcm);
    }


    public static int lcm(int first, int second){
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}
