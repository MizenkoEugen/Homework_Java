// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Homework.Seminar_04;

import java.util.LinkedList;

public class Task_02 {
    private static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        System.out.println(list);
        System.out.println(dequeue());
        System.out.println(list);
        System.out.println(first());
        System.out.println(list);
    }

    public static void enqueue(int element) {
        list.addLast(element);
    }

    public static int dequeue() {
        return list.removeFirst();
    }

    public static int first() {
        return list.getFirst();
    }

}
