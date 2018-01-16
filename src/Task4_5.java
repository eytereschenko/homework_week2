/*
5) Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве
 */

import Utils.ArrayUtils;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        int array[] = ArrayUtils.createRandomArray(10);
        System.out.print("Enter number to find: ");
        Scanner scanner = new Scanner(System.in);
        int numberToFind = scanner.nextInt();
        int count = 0;
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                count++;
            }
        }
        ArrayUtils.printArray(array);
        System.out.println("Number " + numberToFind + " present in array " + count + " times.");
    }
}
