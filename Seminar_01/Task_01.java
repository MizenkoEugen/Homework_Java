// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework.Seminar_01;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        System.out.printf("Результат вычисления n-ого треугольного числа: %d\n", Res1(n));
        System.out.printf("Результат вычисления произведения чисел от 1 до n: %d\n", Res2(n));
        iScanner.close();
    }

    public static int Res1(int n) {
        return (n * (n + 1)) / 2;

    }

    public static int Res2(int n) {

        int s = 1;
        for (int i = 1; i <= n; i++) {

            s = s * i;

        }
        return (s);

    }
}