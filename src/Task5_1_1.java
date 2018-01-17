import java.util.Scanner;

/*
5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
 */
/*
Перевод в десятичную:
 */
public class Task5_1_1 {
    public static void main(String[] args) {
        System.out.println("Enter binary number: ");
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();
        int chek = 0;
        for (int i = 0; i < length; i++) {
            if (number / Math.pow(10, length - i - 1) == 1 || number / Math.pow(10, length - i - 1) == 0) {
                result = (int) (result + number / Math.pow(10, length - i - 1) * Math.pow(2, length - i - 1));
                number = (int) (number % Math.pow(10, length - i - 1));
            } else {
                System.out.print("The number should be in binary type");
                chek = 1;
                break;

            }
        }
        if (chek == 0) {
            System.out.println("Result is: " + result);
        }
    }
}
