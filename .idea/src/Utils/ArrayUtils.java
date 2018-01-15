package Utils;

import java.lang.reflect.Array;

public class ArrayUtils {
    public static int[] createRandomArray(int size) {
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = (int) ((Math.random() - 0.5) * 100);
        }
        return array1;
    }

    public static void printArray(int[] array) {
        int length = Array.getLength(array);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
