package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 6:
 * Проверить, является ли массив возрастающей последовательностью (каждое
 * следующее число больше предыдущего).
 */

public class Task6 {
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

        boolean isIncreasing = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
        scanner.close();
    }
}
