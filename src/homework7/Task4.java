package homework7;

import java.util.Arrays;

/**
 * Задача 4:
 * Ввести 3 строки с консоли. Найти слово, состоящее только из различных
 * символов. Если таких слов несколько, найти первое из них.
 */

public class Task4 extends ScannerClass {
    public static void main(String[] args) {
        String[] myMassive = scannerVoid();
        System.out.println(Arrays.toString(myMassive));

        boolean hello = false;
        int number = 0;
        int numberMassive = 1;
        for (String s : myMassive) {
            String[] newMassive = s.split("[ ,]+");
            System.out.printf("Массив №%d %s%n", numberMassive, Arrays.toString(newMassive));
            number++;
            numberMassive++;

            for (String uniqueness : newMassive) {
                if (hasUniqueChars(uniqueness)) {
                    System.out.printf("Нашли слово \"%s\" подходящее под условие в строке %d%n", uniqueness, number);
                    hello = true;
                    break;
                }
            }
        }

        if (!hello) {
            System.out.println("Слов с уникальными символами не найдено");
        }
    }
}
