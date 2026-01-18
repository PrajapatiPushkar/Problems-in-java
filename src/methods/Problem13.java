package src.methods;

//loops Patterns

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("We are here to print patterns\n");
        System.out.print("please enter the number of rows: ");
        int rows = input.nextInt();
        printFirstPattern(rows);
        printSecondPattern(rows);

    }

    public static void printFirstPattern(int maxRows) {
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void printSecondPattern(int maxRows) {
        System.out.println("\n here is second  pattern");
        int rows = maxRows;
        while (rows > 0 ) {
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
