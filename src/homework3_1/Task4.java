package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 4:
 * Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
 * вывести сообщение, что их нет.
 */

public class Task4 {
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

        int quantity = 0;
        for (int number : numbers) {
            if (number == 0) {
                quantity++;
            }
        }

        if (quantity == 0) {
            System.out.println("Нет нулей");
        } else {
            System.out.println("Количество нулей в массиве: " + quantity);
        }
        scanner.close();
    }
}
