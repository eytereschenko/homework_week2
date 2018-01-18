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

    public static int[] sumOfArrays(int[] array1, int[] array2) {
        int[] arraySum = new int[array1.length];
        if (array1.length != array2.length) {
            System.out.println("Arrays should be with same length");
        } else {
            for (int i = 0; i < array1.length; i++) {
                arraySum[i] = array1[i] + array2[i];
            }
        }
        return arraySum;
    }

    public static int[] createArrayFrom25To75(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) ((Math.random() * 50) + 25);
        }
        return array;
    }

    public static int[] splitArray(int[] arr, int start, int end) {
        // обрезать массив по границам start и end
        int newLength = end - start + 1;
        int[] resultArray = new int[newLength];
        for (int i = start; i <= end; i++) {
            resultArray[i - start] = arr[i];
        }
        return resultArray;
    }

    public static int[] invertArray(int[] array) {
        int buffer;
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            buffer = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = buffer;
        }
        return array;
    }
}
