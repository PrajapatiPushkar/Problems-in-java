package src.loops;

//create a program that calculate grades based on marks

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculate your marks according to grades");
        System.out.println("please enter your marks: ");
            int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("you got A grade.");
        } else if (marks >= 75) {
            System.out.println("you got B grade.");
        } else if (marks >= 60) {
            System.out.println("you got C grade");
        } else if (marks >= 30) {
            System.out.println("you got D grade.");
        } else {
            System.out.println("you got fail");
        }
    }
}
