package src.bitwise;

//bitwise complement

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcasing of not/compliment operator");
        System.out.println("please enter your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("your result is: " + result);
    }
}
