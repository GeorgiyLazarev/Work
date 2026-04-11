package homework7;

import java.util.Scanner;

/**
 * Задача 5:
 * Вывести на консоль новую строку, которой задублирована каждая буква из
 * начальной строки. Например, "Hello" -> "HHeelllloo"
 */

public class Task5 extends ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи какую - нибудь строку, бро: ");
        String task5 = scanner.nextLine();

        String result = duplicate(task5);
        System.out.println(result);
    }
}
