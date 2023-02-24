// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой

package Homework.Seminar_03;

import java.util.ArrayList;
import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        ArrayList<Integer> col1 = new ArrayList<>();
        ArrayList<Integer> col2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            col1.add(rnd.nextInt(0, 10));
            col2.add(rnd.nextInt(0, 10));
        }
        System.out.printf("Коллекция A: %s\n", col1);
        System.out.printf("Коллекция B: %s\n", col2);
        System.out.printf("Разность коллекций A - B: %s\n", diff(col1, col2));
        System.out.printf("Разность коллекций B - A: %s\n", diff(col2, col1));
        System.out.printf("Симметрическая разность коллекций A ^ B: %s\n", simdiff(col1, col2));
    }

    public static ArrayList<Integer> diff(ArrayList<Integer> col1, ArrayList<Integer> col2) {
        ArrayList<Integer> res = new ArrayList<Integer>(col1.size());
        for (int item : col1)
            res.add(item);
        res.removeAll(col2);
        return res;
    }

    public static ArrayList<Integer> simdiff(ArrayList<Integer> col1, ArrayList<Integer> col2) {
        ArrayList<Integer> res = new ArrayList<Integer>(diff(col1, col2).size() + diff(col2, col1).size());
        res.addAll(diff(col1, col2));
        res.addAll(diff(col2, col1));
        return res;

    }

}
