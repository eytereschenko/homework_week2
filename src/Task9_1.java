import Utils.ArrayUtils;

import java.util.Scanner;

/*
9. Написать методы сортировки selectSort, insertSort.
--insertSort
 */
public class Task9_1 {
    public static void main(String[] args) {
        System.out.print("Enter your array: ");
        Scanner scanner = new Scanner(System.in);
        int array[] = ArrayUtils.enterArrayFromKeybord();
        System.out.print("Yor array is: ");
        ArrayUtils.printArray(array);
        ArrayUtils.insertSort(array);
        System.out.print("Sorted by insert array is: ");
        ArrayUtils.printArray(array);
    }
}
