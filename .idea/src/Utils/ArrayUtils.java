package Utils;

import java.lang.reflect.Array;

public class ArrayUtils {
    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() - 0.5) * 100;
        }
        return array;
    }

    public static void printArray(int[] array) {
        int length = Array.getLength(array);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
