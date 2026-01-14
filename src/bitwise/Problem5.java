package src.bitwise;

import java.util.Scanner;

//leftShift
public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcasing leftShift operator");
        System.out.println("please enter your number: ");
        int num = input.nextInt();

        int result = num << 4 ;
        System.out.println("your result is: " + result);
    }
}
