package homework8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Задача 1:
 * Пользователь вводит набор чисел в виде одной строки с клавиатуры.
 * Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
 * Вывести результат на экран.
 * При решении использовать коллекции.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи числа в виде одной строки с клавиатуры.\n" +
                "Например: \"1, 2, 3, 4, 4, 5\": ");
        String number = scanner.nextLine();
        String[] numbers = number.split(",\\s");

        ArrayList<Integer> numbersArray = new ArrayList<>();

        for (String num : numbers) {
            numbersArray.add(Integer.parseInt(num));
        }
        System.out.println(numbersArray);

        HashSet<Integer> numbersSet = new HashSet<>(numbersArray);
        ArrayList<Integer> newNumbersArray = new ArrayList<>(numbersSet);

        System.out.println(newNumbersArray);
    }
}
