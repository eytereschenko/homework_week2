import java.util.Scanner;
/*
5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
                                5678  -   1
                                5889  -   2
                                8888  -   4
                                989990  - 1

 */
public class Task5_3 {
    public static void main(String[] args) {
        System.out.print("Ener the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = Math.abs(number);
        int result = 0;
        int numberToFind = 8;
        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
            if (number % 10 == numberToFind) {
                result++;
                number = number - number % 10;
                number /= 10;
            } else {
                number = number - number % 10;
                number /= 10;
            }
        }
        System.out.println("The result is: " + result);
    }
}
