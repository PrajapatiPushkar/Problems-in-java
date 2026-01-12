package src.operator;

//create a program to calculate the area of the triangle.

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("please enter the breath of triangle: ");
        double B = input.nextDouble();
        System.out.println("enter the height of the triangle: ");
        double H = input.nextDouble();

        double area = 0.5 * B * H;//(B*H)/2
        System.out.println("Area of triangle is: " + area);

    }
}
