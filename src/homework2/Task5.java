package homework2;

import java.util.Scanner;

/**
 * Задача *:
 * Напишите программу, где пользователь вводит любое целое положительное
 * число.
 * А программа суммирует все числа от 1 до введенного пользователем числа. Для
 * ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
 * пользователь не мог ввести некорректные данные
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи любое целое число: ");

        int number = scanner.nextInt();
        int sum = 0;

        if (number <= 0) {
            System.out.println("Выберите число больше 0");
        } else {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
        }

        scanner.close();
    }
}
