import java.util.Scanner;

/*
5.4. Последовательность Фибоначчи определяется так:
                     φ0=0,  φ1=1, ..., φn=φn-1+φn-2.

                     По данному числу n определите n-е число Фибоначчи φn.
 */
public class Task5_4 {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number_1 = 1;
        int number_n = 0;
        int buff;

        for (int i = 0; i <= number; i++) {

            buff = number_n;
            number_n += number_1;
            number_1 = buff;
        }

        System.out.println("Result for " + number + " = " + number_n);
    }
}
