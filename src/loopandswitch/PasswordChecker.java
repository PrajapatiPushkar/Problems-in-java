package src.loopandswitch;

//Create a program using do-while to find password checker until a valid password is entered.

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int password;
//        do {
//            System.out.print("Please enter your password: ");
//            password = input.nextInt();
//        }while (password != 1234);
//        System.out.println("Password is correct !! login: " + password);

        System.out.println("Welcome to Set your password\n");
        String password;

        do {
            System.out.println("Please enter your password: ");
             password = input.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering valid password");
    }

    public static boolean isValidPassword(String password) {

        return password.length() > 6;
    }
}
