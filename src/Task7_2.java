/*
7.2 Проверить или является число простым
 */

import java.util.Scanner;

public class Task7_2 {
    public static void main(String[] args) {
        System.out.print("Enter number to check: ");
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.print("Your number is prime");
        } else {
            System.out.println("Your number isnt prime");
        }
    }
}
