package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 5:
 * Пройти по массиву и поменять местами элементы первый и последний, второй
 * и предпоследний и т.д.
 */

public class Task5 {
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

        for (int i = 0; i < numbers.length / 2; i++) {
            int j = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = j;
        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
