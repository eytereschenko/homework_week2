/*
6. Игра "Угадай число":
           Програма генерирует случайное, целое число в диапазоне от 25 до 125 (включительно).
           Пользователь пытается его угадать.
           Число попыток ограничено 5.
           Если пользователь ввел неверное число, программа дает подсказу (больше/меньше).
           Придумать разные варианты ответов, при отгадывании с первой попытки, нескольких попыток, в случае проигрыша.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moreOrLess;
        int countOfTry = 5;
        int from = 25;
        int to = 125;
        int res = 0;
        int count = 1;
        int numberToBeFind = (int) (Math.random() * (to - from) + from);
//Выводим чтоб можно было проверить
        System.out.println(numberToBeFind);
        System.out.println("Enter number:");
        for (int i = 0; i < countOfTry && res != 1 && count <= countOfTry; i++) {
            int number = scanner.nextInt();
            if (number == numberToBeFind) {
                res = 1;
            } else {
                count++;
            }

            if (number > numberToBeFind) {
                moreOrLess = "less";
            } else {
                moreOrLess = "more";
            }

            if (res != 1 && count <= countOfTry) {
                System.out.println("Enter one more time " + moreOrLess + " number");
            }

        }
        if (res == 0) {
            System.out.println("Sorry, you lose");
        } else {
            System.out.println("Good job! you guessed number from " + count + " times");
        }
    }
}