import java.util.Scanner;

/*
5.2. Вычислить факториал числа.
 */
public class Task5_2 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        if (number < 0) {
            System.out.println("Number should be > 0");
        } else {
            for (int i = 0; i < number; i++) {
                result = result * (i + 1);
            }
        }
        System.out.println("Factorial of " + number + " = " + result);
    }
}
