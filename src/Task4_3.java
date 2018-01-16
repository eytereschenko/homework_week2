import Utils.*;
/*
            	3) Поменять местами наибольший
               		и наименьший элементы в массиве
 */


import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = ArrayUtils.createRandomArray(size);
        ArrayUtils.printArray(array);
        int placeOfMax = ArrayUtils.findPlaceOfMax(array);
        int placeOfMin = ArrayUtils.findPlaceOfMin(array);
        int max = ArrayUtils.findMax(array);
        int min = ArrayUtils.findMin(array);
        array[placeOfMax] = min;
        array[placeOfMin] = max;
        ArrayUtils.printArray(array);
    }
}
