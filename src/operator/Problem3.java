package src.operator;

//create a program to calculate perimeter of two floating point number.
//perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          System.out.println("Welcome to perimeter calculator ");
//        System.out.println("Enter your size of first side: ");
//        int sideA = input.nextInt();
//        System.out.println("Enter your size of second side: ");
//        int sideB = input.nextInt();
//        System.out.println("Enter your size of third side: ");
//        int sideC = input.nextInt();
//        System.out.println("Enter your size of furth side: ");
//        int sideD = input.nextInt();
//        //calcute
//        int perimeter = sideA + sideB + sideC + sideD;
//        //print
//        System.out.println("The perimeter is: " + perimeter);

        System.out.println("please enter all 4 sides in cm: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a + b + c + d;

        System.out.println("Perimeter of your rectangle is " + perimeter + "cms" );

    }

}
