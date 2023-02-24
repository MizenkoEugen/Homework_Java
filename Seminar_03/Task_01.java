//Реализовать алгоритм сортировки слиянием.

package Homework.Seminar_03;

import java.util.Arrays;

public class Task_01 {

    public static void main(String[] args) {
        int[] arr = { 9, 8, 4, 2, 7, 6, 5, 9, 6, 1, 3 };
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) { // функция сортировки слиянием

        int len = arr.length;
        if (len == 1)
            return;

        int mid = len / 2;
        int[] larr = new int[mid]; // левая часть массива
        int[] rarr = new int[len - mid]; // правая часть массива

        for (int i = 0; i < mid; i++) {
            larr[i] = arr[i];
        }
        for (int i = 0; i < len - mid; i++) {
            rarr[i] = arr[i + mid];
        }
        mergeSort(larr); // рекурсивный вызов для левой части
        mergeSort(rarr); // рекурсивный вызов для правой части
        merge(arr, larr, rarr); // вызов функции слияния 2-х массивов
    }

    private static void merge(int[] arr, int[] larr, int[] rarr) { // функция слияния двух массивов
        int ll = larr.length;
        int lr = rarr.length;
        int i = 0;
        int j = 0;
        int ind = 0;

        while (i < ll && j < lr) {
            if (larr[i] < rarr[j]) {
                arr[ind] = larr[i];
                i++;
                ind++;
            } else {
                arr[ind] = rarr[j];
                j++;
                ind++;
            }
        }
        while (i < ll) {
            arr[ind] = larr[i];
            i++;
            ind++;
        }
        while (j < lr) {
            arr[ind] = rarr[j];
            j++;
            ind++;
        }
    }

}