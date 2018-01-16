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

        System.out.print("Yor random array is: ");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println("");
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        int length = Array.getLength(array);
        for (int i = 0; i < length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] sortArrayByBubble(int[] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        return array;
    }

    public static int findPlaceOfMax(int[] array) {
        int number = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                number = i;
            }
        }
        return number;
    }

    public static int findPlaceOfMin(int[] array) {
        int number = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                number = i;
            }
        }
        return number;
    }
}
