package homework8;

import static homework8.WordMultiple.wordMultiple;

/**
 * Задача 3:
 * На вход поступает массив строк, верните Map<String, Boolean>, где каждая
 * отдельная строка является ключом, и ее значение равно true, если эта строка
 * встречается в массиве 2 или более раз. Пример:
 * wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

public class Task3 {
    public static void main(String[] args) {
        String[] test1 = {"a", "b", "a", "c", "b"};
        System.out.println("Тест 1: " + wordMultiple(test1));

        String[] test2 = {"c", "b", "a"};
        System.out.println("Тест 2: " + wordMultiple(test2));

        String[] test3 = {"c", "c", "c", "c"};
        System.out.println("Тест 3: " + wordMultiple(test3));
    }
}
