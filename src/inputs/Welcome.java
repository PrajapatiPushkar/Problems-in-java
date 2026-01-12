package src.inputs;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner input =  new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hi, Welcome to my profile ");
    }
}
