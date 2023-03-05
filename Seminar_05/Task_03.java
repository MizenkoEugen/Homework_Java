// Реализовать алгоритм пирамидальной сортировки (HeapSort)

package Homework.Seminar_05;

import java.util.Arrays;

public class Task_03 {

    public static void main(String[] args) {
        int[] array = { 6, 1, 7, 3, 5, 8, 0 };
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int begin, int end) {
        if (begin == end)
            return;

        int mid = (begin + end) / 2;
        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);

        int[] sorted = new int[array.length];
        int inLeft = begin, inRight = mid + 1, inSorted = begin;
        int endLeft = mid + 1, endRight = end + 1;
        while (inLeft < endLeft || inRight < endRight) {
            if (inLeft < endLeft && inRight < endRight) {
                if (array[inLeft] < array[inRight])
                    sorted[inSorted++] = array[inLeft++];
                else
                    sorted[inSorted++] = array[inRight++];
            } else if (inLeft < endLeft)
                sorted[inSorted++] = array[inLeft++];
            else if (inRight < endRight)
                sorted[inSorted++] = array[inRight++];
        }

        for (int i = begin; i <= end; i++)
            array[i] = sorted[i];
    }
}