package src.array;

//Create a program to find the  sum and average of the all elements in an array.
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        System.out.println("Welcome to Array sum and Average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the number is: " + sum);
        System.out.println("Average of the numbers is: " + avg);

    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
       return sum;
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}
