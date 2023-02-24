//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Homework.Seminar_03;

import java.util.ArrayList;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(rnd.nextInt(0, 10));
        }
        System.out.println(arr);
        arr.removeIf(n -> (n % 2 == 0));
        System.out.println(arr);
    }
}