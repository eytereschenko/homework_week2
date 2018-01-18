/*
10.*
        "Лотерея"

        Програма генерирует шесть случайных, целых чисел в диапазоне от 1 до 42 (включительно).

        Числа не должны совпадать!!! (сделать отдельным методом в классе ArrayUtils)

        Пользователь вводит 6 разных чисел в диапазоне от 1 до 42 (включительно). (сделать отдельным методом)

        Программа вывод в консоль выпавшые номера в порядке возрастания

        (использовать один из методов в Вашем классе ArrayUtils).

        И показывает количество угаданных пользователем чисел. (сделать отдельным методом)

        Придумать варианты поздравлений на случаи совпадений (3 из 6, 4 из 6, 5 из 6, 6 из 6, прочие).
 */

import Utils.ArrayUtils;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int size = 6;
        int from = 1;
        int to = 42;
        Scanner scanner = new Scanner(System.in);
        int array[] = ArrayUtils.createRandomArrayWithUniqValuesFromAToB(size, from, to);
        System.out.println("Enter " + size + " numbers: ");
        int[] arrayToGuess = new int[size];
        for (int i = 0; i < size; i++) {
            arrayToGuess[i] = scanner.nextInt();
        }
        System.out.println("The numbers of lottery are:");
        ArrayUtils.insertSort(array);
        ArrayUtils.printArray(array);
        int result = ArrayUtils.compareArrays(array, arrayToGuess);
        if (result <= 2) {
            System.out.println("Sorry, you lose");
        } else if (result == 3) {
            System.out.println("You guessed 3 numbers. Take 1$, man");
        } else if (result == 4) {
            System.out.println("You guessed 5 numbers. Take 100$, man");
        } else if (result == 5) {
            System.out.println("You guessed 5 numbers. Take 1000$, man");
        } else if (result == 6) {
            System.out.println("You WIN Jack Pot!");
        }
    }
}
