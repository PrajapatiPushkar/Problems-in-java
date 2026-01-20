package src.loopandswitch;

//Create a program using for-each to the occurrences of a specific element in an array.

import src.array.ArrayUtility;

import java.util.Scanner;

public class SpecificElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        int[] nums = ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to search: ");
        int element = input.nextInt();
        int occ = countOcc(nums, element);
        System.out.println("Your element was fount: " + occ + " times.");
    }

    public static int countOcc(int[] nums, int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            }
        }
        return occ;

    }
}
