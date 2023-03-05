package Homework.Seminar_06;

import java.util.HashSet;
import java.util.Set;

public class NotebookDataBase {

    public static Set<Notebook> getData() {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook(16, 500, 3200, "Aser", "White", "Windows"));
        notebooks.add(new Notebook(16, 1000, 3400, "Aser", "Black", "Windows"));
        notebooks.add(new Notebook(32, 1000, 3800, "Asus", "Black", "Windows"));
        notebooks.add(new Notebook(32, 1000, 4000, "Asus", "Red", "Windows"));
        notebooks.add(new Notebook(8, 256, 3000, "Apple", "Gold", "macOS"));
        notebooks.add(new Notebook(8, 512, 3000, "Apple", "White", "macOS"));
        notebooks.add(new Notebook(8, 512, 3000, "Apple", "White", "macOS"));
        notebooks.add(new Notebook(32, 512, 3200, "Sumsung", "Black", "Windows"));
        notebooks.add(new Notebook(12, 2000, 4000, "Sumsung", "Green", "Linux"));
        return notebooks;
    }
}