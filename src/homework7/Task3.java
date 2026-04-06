package homework7;

/**
 * Задача 3:
 * Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
 * меньше средней, а также их длину
 */

public class Task3 extends ScannerClass {
    public static void main(String[] args) {
        String[] myMassive = scannerVoid();

        double sum = 0;
        for (String s : myMassive) {
            sum += s.length();
        }
        double average = sum / 3;
        System.out.printf("Средняя длина строк: %.2f%n", average);

        boolean hello = false;
        for (String i : myMassive) {
            if (i.length() < average) {
                System.out.printf("Строка попадающая под условие: %s; Длина %d%n", i, i.length());

                hello = true;
            }
        }

        if (!hello) {
            System.out.println("Видимо нет таких строк, которые подходят под условия");
        }
    }
}
