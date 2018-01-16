import Utils.*;

/*
4) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Task4_4 {
    public static void main(String[] args) {
        int[] arrayA = ArrayUtils.createRandomArray(5);
        int[] arrayB = ArrayUtils.createRandomArray(5);
        System.out.print("Array A: ");
        ArrayUtils.printArray(arrayA);
        System.out.print("Array B: ");
        ArrayUtils.printArray(arrayB);
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }
        System.out.print("Now array A: ");
        ArrayUtils.printArray(arrayA);
        System.out.print("Now array B: ");
        ArrayUtils.printArray(arrayB);
    }
}
