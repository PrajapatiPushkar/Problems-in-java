package src.loops;

//create a problem that categorize a person into different age groups

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("welcome to age identifier ");
        System.out.println("Please, enter your age: ");
        int age = input.nextInt();

        if (age <= 13) {
            System.out.println("You are a child");
        } else if (age <= 20) {
            System.out.println("you are a teenager");
        } else if (age <= 60 ) {
            System.out.println("you are a adult");
        } else {
            System.out.println("you are a senior");
        }
    }
}
