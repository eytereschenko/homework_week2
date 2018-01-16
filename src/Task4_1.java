import Utils.*;

/*
1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Task4_1 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createRandomArray(10);
        ArrayUtils.printArray(array);
        int max = ArrayUtils.findMax(array);
        int min = ArrayUtils.findMin(array);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }

}