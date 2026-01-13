package src.loops;

//create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to leap year checking.");
        System.out.println("please enter your year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0) ){
            System.out.println("your year is a leap year");
        }  else {
            System.out.println("your year is not! a leap year");
        }
    }
}
