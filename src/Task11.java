/*
11.* Написать программу, которая возвращает факториал чисел 21 и больше.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        BigInteger res, a, b;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        res = BigInteger.valueOf(1);

        for(int i=1; i<n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of " + n + " = " + res.toString());
    }
}
