package src.bitwise;
//bitwise XOR
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise XOR operator");
        System.out.println("please enter the first number");
        int first = input.nextInt();
        System.out.println("enter the other number");
        int second = input.nextInt();

        int result =  first ^ second;
        System.out.println("result is: " + result);
    }
}
