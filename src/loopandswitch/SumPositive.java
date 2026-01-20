package src.loopandswitch;

//Create a program using continue to sum all positive
// numbers entered by the user; skip any negative numbers

import src.array.ArrayUtility;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Adding positive numbers.\n");
        int[] numArr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of the positive number is: " + sum);
    }
}
