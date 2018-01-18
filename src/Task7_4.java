/*
	7.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
		Количество позиций и массив указывает пользователь
 */

import Utils.ArrayUtils;

import java.util.Scanner;

public class Task7_4 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.enterArrayFromKeybord();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Original array:");
        ArrayUtils.printArray(arr);
        System.out.println("Enter number of steps to move array");
        int steps = scanner.nextInt();
        int[] newArray = ArrayUtils.moveArray(arr, steps);
        System.out.println("now your moved array is: ");
        ArrayUtils.printArray(newArray);
    }
}
