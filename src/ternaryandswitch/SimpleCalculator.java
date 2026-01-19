package src.ternaryandswitch;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("now, enter the operation: ");
        String operation = input.next();

        int result =  switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.print("Your answer is: " + result);

    }
}
