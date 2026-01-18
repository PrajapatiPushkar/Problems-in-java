package src.array;

//Create a program to check is the array is palindrome or not.

public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome Checker\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if (isPalin) {
            System.out.println("Your array is Palindrome.");
        } else {
            System.out.println("your array is not Palindrome.");
        }
     }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while (i < numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
