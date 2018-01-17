/*
	8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */

import Utils.ArrayUtils;

public class Task4_8 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createRandomArray(10);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                if (Math.abs(array[i]) % 2 != 0) {
                    array[i]++;
                }
            } else {
                if (Math.abs(array[i]) % 2 != 1) {
                    array[i]--;
                }
            }
        }
        System.out.print("You random array is: ");
        ArrayUtils.printArray(array);

    }
}
