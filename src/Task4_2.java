import Utils.*;

/*
	2) Найти среднее арифметическое массива
 */

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        System.out.println("Enter size of your array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = ArrayUtils.createRandomArray(size);
        System.out.print("You random array is: ");
        ArrayUtils.printArray(array);
        int sumOfArray = 0;
        for (int i = 0; i < size; i++) {
            sumOfArray = sumOfArray + array[i];
        }
        double result = sumOfArray / (double) size;
        System.out.println("Average value is: " + result);
    }

}
