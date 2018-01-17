/*
	10) Написать метод, который будет обрезать массив по границам start и end
 */

import Utils.ArrayUtils;

import java.util.Scanner;

public class Task4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of primary array: ");
        int size = scanner.nextInt();
        System.out.println("Enter start of new array: ");
        int start = scanner.nextInt();
        System.out.println("Enter end of new array: ");
        int end = scanner.nextInt();
        int[] array = ArrayUtils.createRandomArray(size);
        int[] newArray = ArrayUtils.splitArray(array, start, end);
        ArrayUtils.printArray(array);
        ArrayUtils.printArray(newArray);
    }
}

