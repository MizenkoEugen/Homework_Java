package Homework.Seminar_06;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Controller {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int val = 0;
        String str;
        Set<Notebook> notebooks = NotebookDataBase.getData();
        HashMap<String, Integer> techFilter = new HashMap<>();
        HashMap<String, String> labelFilter = new HashMap<>();
        while (n != 5) {
            System.out.println(
                    "Введите цифру, соответствующую критерию \n 1 - ОЗУ (RAM) \n 2 - Объем ЖД (SSD) \n 3 - Операционная система \n 4 - Цвет \n 5 - Вывести список по фильтрам");
            System.out.print("ввод: ");
            n = sc.nextInt();

            if (n == 1) {
                System.out.print("Введите минимальное значение ОЗУ: ");
                val = sc.nextInt();
                techFilter.put("RAM", val);

            } else if (n == 2) {
                System.out.print("Введите минимальное значение SSD: ");
                val = sc.nextInt();
                techFilter.put("SSD", val);

            } else if (n == 3) {
                System.out.print("Введите ОС (Windows, macOS, Linux): ");
                sc.nextLine();
                str = sc.nextLine();
                labelFilter.put("OC", str);

            } else if (n == 4) {
                System.out.print("Введите цвет (Black, White, Red, Gold, Green): ");
                sc.nextLine();
                str = sc.nextLine();
                labelFilter.put("Color", str);

            }
            System.out.println("Параметров в фильтре: " + (int) (techFilter.size() + labelFilter.size()));
        }
        List<Notebook> filtredNoodbooks = Filter.notebookFiltation(notebooks, techFilter, labelFilter);

        if (!techFilter.isEmpty())
            System.out.println(techFilter);
        if (!labelFilter.isEmpty())
            System.out.println(labelFilter);
        if (filtredNoodbooks.isEmpty())
            System.out.println("Список фильтрации пуст!");
        else
            for (Notebook notebook : filtredNoodbooks) {
                System.out.println(notebook.toString());
            }
        sc.close();
    }
}