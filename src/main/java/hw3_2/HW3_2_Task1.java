


package hw3_2;

import java.awt.datatransfer.StringSelection;
import java.util.*;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.
public class HW3_2_Task1 {
    public static String[] surnames = {"Петров", "Сидоров", "Иванов", "Пупкин", "Козлов", "Баранов", "Пупкин", "Орлов", "Уткин", "Петров", "Пупкин", "Сидоров", "Жуков", "Волков", "Лебедев"};

    public static HashSet<String> getUniqueSurnames(String[] surnames) {
        return new HashSet<>(Arrays.asList(surnames));
    }
    public static HashMap<String, Integer> getSurnamesCount(String[] surnames){
        HashMap<String, Integer> surnameCount = new HashMap<>();
        for (int i = 0; i < surnames.length; i++) {
            String string = surnames[i];
            surnameCount.put(string, surnameCount.getOrDefault(string, 0) + 1); // тут не понял
        }
        return surnameCount;
    }
    public static void main(String[] args) {
        System.out.println(getUniqueSurnames(surnames.clone()));
        System.out.println(getSurnamesCount(surnames.clone()));
    }
}


