/*
6) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */

import Utils.ArrayUtils;

public class Task4_6 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = ArrayUtils.createRandomArray(size);
        System.out.println("Original array is: ");
        ArrayUtils.printArray(array);
        ArrayUtils.sortArrayByBubble(array);
        int[] resultArray = ArrayUtils.splitArray(array, size / 2 - 1, size - 1);
        System.out.println("Half of array: ");
        ArrayUtils.printArray(resultArray);
    }
}
