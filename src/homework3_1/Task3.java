package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 3:
 * Найти индексы минимального и максимального элементов и вывести в консоль.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введи целое число, как размер массива: ");
        int sizeArray = scanner.nextInt();

        int[] numbers = new int[sizeArray];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }

            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Индекс максимального числа: " + maxIndex);
        System.out.println("Индекс минимального числа: " + minIndex);

        scanner.close();
    }
}
