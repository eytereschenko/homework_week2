/*
7.1 Инвертировать массив (без использования допольнительного массива)
 */

import Utils.ArrayUtils;

public class Task7_1 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = ArrayUtils.createRandomArray(size);
        System.out.print("You origin array is: ");
        ArrayUtils.printArray(array);
        System.out.println();
        System.out.print("You invert array is: ");
        ArrayUtils.invertArray(array);
        ArrayUtils.printArray(array);

    }
}
