// Реализовать простой калькулятор 
// Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

package Homework.Seminar_01;

import java.util.Scanner;

public class Task_03 {

    static int getRes(char opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите оператор: -, +, *, /");
        char op = scan.next().charAt(0);
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        scan.close();
        int result = getRes(op, num1, num2);
        System.out.printf("%d %s %d = %d", num1, op, num2, result);
    }

}
