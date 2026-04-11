package homework7;

import java.util.Arrays;

/**
 * Задача 2:
 * Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
 * возрастания значений их длины.
 */

public class Task2 extends ScannerClass {
    public static void main(String[] args) {
        String[] myMassive = scannerVoid();
        System.out.println(Arrays.toString(myMassive));

        for (int i = 0; i < myMassive.length - 1; i++) {
            for (int j = 0; j < myMassive.length - 1 - i; j++) {
                if (myMassive[j].length() > myMassive[j + 1].length()) {
                    String temp = myMassive[j];
                    myMassive[j] = myMassive[j + 1];
                    myMassive[j + 1] = temp;
                }
            }
        }

        System.out.printf("Отсортированный массив: %s", Arrays.toString(myMassive));
    }
}
