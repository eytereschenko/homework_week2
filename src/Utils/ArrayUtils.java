package Utils;

import java.lang.reflect.Array;
import java.util.Scanner;

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

    public static int[] createArrayFromAToB(int size, int start, int end) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) ((Math.random() * (end - start)) + start);
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

    public static int[] insertSort(int[] array) {
        int buffer = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                buffer = array[j];
                array[j] = array[j - 1];
                array[j - 1] = buffer;
            }
        }
        return array;
    }

    public static int[] enterArrayFromKeybord() {
        System.out.print("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println();
        System.out.print("Enter " + size + " elements of your array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] selectSort(int[] array) {
        int buffer;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            buffer = array[i];
            array[i] = array[min];
            array[min] = buffer;
        }
        return array;
    }

    public static int[] createRandomArrayWithUniqValuesFromAToB(int size, int from, int to) {
        int array[] = new int[size];
        //запишем числа от from до to в массив
        int arrayFromTo[] = new int[to];
        for (int i = from; i <= to; i++) {
            arrayFromTo[i - 1] = i;
        }
        for (int i = 0; i < size; i++) {
            int j = (int) (Math.random() * (to - from - i) + from + i);
            array[i] = arrayFromTo[j];
            arrayFromTo[j] = from - i - 1;
            sortArrayByBubble(arrayFromTo);
        }
        return array;
    }

    public static int compareArrays(int[] arr1, int[] arr2) {
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public static int[] moveArray(int[] arr, int steps) {
        int[] arrResult = new int[arr.length];
        for (int j = 0; j < steps; j++) {
            arrResult[0] = arr[arr.length - 1];
            for (int i = 1; i < arr.length; i++) {
                arrResult[i] = arr[i - 1];
            }
        }
        return arrResult;
    }
}
