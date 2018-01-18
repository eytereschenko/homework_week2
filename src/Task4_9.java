/*
9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */

import Utils.ArrayUtils;

public class Task4_9 {
    public static void main(String[] args) {
        int size1 = 10;
        int size2 = 12;
        int count1 = 0;
        int count2 = 0;
        int start = 25;
        int end = 75;
        int[] array1 = ArrayUtils.createArrayFromAToB(size1, 25, 75);
        int[] array2 = ArrayUtils.createArrayFromAToB(size2, 25, 75);
        for (int i = 0; i < size1; i++) {
            if (array1[i] % 2 == 0) {
                count1++;
            }
        }
        for (int i = 0; i < size2; i++) {
            if (array2[i] % 2 == 0) {
                count2++;
            }
        }
        System.out.print("1st array: ");
        ArrayUtils.printArray(array1);
        System.out.print("2nd array: ");
        ArrayUtils.printArray(array2);
        if (count1 > count2) {
            System.out.println("Array 1 has more even numbers");
        } else if (count1 == count2) {
            System.out.println("Array 1 has same even numbers as array2 ");
        } else {
            System.out.println("Array 2 has more even numbers");
        }
    }
}
