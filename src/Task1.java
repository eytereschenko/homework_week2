import Utils.*;
/*

 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createRandomArray(10);
        ArrayUtils.printArray(array);
        int max = ArrayUtils.findMax(array);
        int min = ArrayUtils.findMin(array);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }

}