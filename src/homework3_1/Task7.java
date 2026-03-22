package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача *:
 * Имеется массив из неотрицательных чисел(любой). Представьте что массив
 * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
 * добавить единицу к этому “числу” и на выходе получить исправленный массив.
 * Массив не содержит нуля в начале, кроме самого числа 0.
 * Пример:
 * Input: [1,4,0,5,6,3]
 * Output: [1,4,0,5,6,4]
 * Input: [9,9,9]
 * Output: [1,0,0,0]
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введи целое число, как размер массива: ");
        int sizeArray = scanner.nextInt();

        int[] numbers = new int[sizeArray];

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                numbers[i] = random.nextInt(9) + 1;
            } else {
                numbers[i] = random.nextInt(10);
            }
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(numbers));
        System.out.println("---------------");

        long number = 0;
        for (int j : numbers) {
            number = number * 10 + j;
        }
        long sumNumber = number + 1;
        System.out.println("Целое число массива + 1: " + sumNumber);

        long t = sumNumber;
        int b = 0;
        while (t > 0) {
            b++;
            t /= 10;
        }

        int[] newMassive = new int[b];
        long c = sumNumber;
        for (int i = newMassive.length - 1; i >= 0; i--) {
            newMassive[i] = (int) (c % 10);
            c /= 10;
        }
        System.out.println("---------------");
        System.out.println("Новый массив с добавлением единицы:\n" + Arrays.toString(newMassive));

        scanner.close();
    }
}
