package src.array;

//Create a program to check if the given array is sorted.

public class SortArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting check post\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if (isInc || isDec) {
            System.out.println("your array is sorted.");
        } else {
            System.out.println("your array is not shorted!");
        }

    }

    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] < numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
