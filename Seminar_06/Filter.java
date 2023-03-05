package Homework.Seminar_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Filter {

    public static List<Notebook> notebookFiltation(Set<Notebook> notebooks, HashMap<String, Integer> techFilter,
            HashMap<String, String> labelFilter) {
        boolean check = true;
        String key;
        String label;
        int value;
        List<Notebook> filtredNoodbooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            for (var entry : labelFilter.entrySet()) {
                key = entry.getKey();
                label = entry.getValue();
                if (!notebook.getLabelParams(key).equals(label)) {
                    check = false;
                }
            }
            for (var entry : techFilter.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (notebook.getTechParams(key) < value) {
                    check = false;
                }
            }
            if (check) {
                filtredNoodbooks.add(notebook);
            } else
                check = true;
        }
        return filtredNoodbooks;
    }
}