/*
5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
 */
/*
Перевод в двоичную:
 */

import java.util.Scanner;

public class Task5_1_2 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        String result = "";
        int number = scanner.nextInt();
        do {
            result = number % 2 + "" + result;
            number /= 2;

        } while (number != 0);
        System.out.println("You binary result is: " + result);
    }
}
