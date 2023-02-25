// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

package Homework.Seminar_04;

import java.util.LinkedList;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {

        LinkedList<Object> ll = new LinkedList<Object>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            ll.add(rnd.nextInt(0, 10));
        }
        System.out.println(ll);
        System.out.println(getreverseLL(ll));
    }

    public static LinkedList<Object> getreverseLL(LinkedList<Object> ll) {
        LinkedList<Object> grl = new LinkedList<Object>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            grl.add(ll.get(i));
        }
        return grl;
    }
}