// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Homework.Seminar_02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_02 {
    public static void main(String[] args) throws IOException {
        // добавление логгера
        Logger logger = Logger.getLogger(Task_02.class.getName());
        FileHandler fileHandler = new FileHandler("Homework/Seminar_02/Task_02.log", true);
        logger.addHandler(fileHandler);
        // заполнение массива случайными числами
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            Random rand = new Random();
            data[i] = rand.nextInt(100);
        }
        System.out.printf("Вывод неотсортированного массива: %s\n", Arrays.toString(data));
        // Сортировка пузырьком
        int i = 0;
        boolean flag = true;
        while (i < data.length - 1) {
            flag = false;
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                    logger.log(Level.INFO, "Hello logging: {0} => {1}", new Object[] { temp, j });
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }
        System.out.printf("Вывод отсортированного массива: %s\n", Arrays.toString(data));
    }
}
