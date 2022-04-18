package hw3_2;

import java.util.HashMap;
import java.util.Map;

// 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий
// и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
public class Phonebook {
    public static Map<String, Integer> phonebook = new HashMap<String, Integer>()
    {{
        put("Ivanov", 5555555);
        put("Ivanov", 1111111);
        put("Petrov", 2222222);
        put("Sidorov", 3333333);
    }};

    private static void add (String surname, Integer phone) {
        phonebook.put(surname, phone);
    }

    private static void get(String surname) {
        System.out.println(phonebook.get("Ivanov"));
            }

    public static void main(String[] args) {
        System.out.println(phonebook);
        add("Pupkin", 4444444);
        System.out.println(phonebook);
        get("Ivanov");

    }
    }///

