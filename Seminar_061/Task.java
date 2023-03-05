// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Homework.Seminar_061;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task {

    public static void main(String[] args) throws Exception {

        Laptop laptop1 = new Laptop("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        Laptop laptop2 = new Laptop("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        Laptop laptop3 = new Laptop("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        Laptop laptop4 = new Laptop("HP 250 G7", 16, 1024, "без ОС", "черный", 15.6);
        Laptop laptop5 = new Laptop("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        Laptop laptop6 = new Laptop("Xiomi RedmiBook 17", 16, 1024, "Windows 11", "красный", 16.8);

        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        unicLaptop.add(laptop6);
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicLaptop.size());

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики ноутбука");
        System.out.print("объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.print("объем накопителя: ");
        int storUser = sc.nextInt();
        System.out.print("диагональ: ");
        double digUser = sc.nextDouble();
        System.out.println();

        for (Laptop lap : unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser) && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
    }
}