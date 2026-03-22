package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 2:
 * Найти минимальный - максимальный элементы и вывести в консоль.
 */

public class Task2 {
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

        int index = numbers[0];
        int maxNumber = index;
        int minNumber = index;

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println("Максимальное значение массива: " + maxNumber);
        System.out.println("Минимальное значение массива: " + minNumber);

        scanner.close();
    }
}
