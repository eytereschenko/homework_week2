/*
7) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
               	   который получается в результате суммы arr1[i] + arr2[i]
 */

import Utils.ArrayUtils;

public class Task4_7 {
    public static void main(String[] args) {
        int size = 5;
        int[] array1 = ArrayUtils.createRandomArray(size);
        int[] array2 = ArrayUtils.createRandomArray(size);
        int[] arraySum = new int[size];
        arraySum = ArrayUtils.sumOfArrays(array1, array2);
        System.out.println("First array is: ");
        ArrayUtils.printArray(array1);
        System.out.println("Second array is: ");
        ArrayUtils.printArray(array2);
        System.out.println("Sum is: ");
        ArrayUtils.printArray(arraySum);
    }
}
