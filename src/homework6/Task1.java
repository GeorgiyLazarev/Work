package homework6;

/**
 * Задача 1:
 * Создать класс с как минимум 4 разными методами, в каждом методе добавить
 * проверку на исключительные ситуации, используя:
 * 1. try- catch
 * 2. try-catch, где catch будет несколько
 * 3. try -catch, с использованием multi - catch
 * 4. try-catch-finally
 * Продемонстрировать обработку исключительных ситуаций на примерах
 */

public class Task1 {
    public static void main(String[] args) {

        String[] arr = {"10", "abc"};
        String[] arr2 = {};

        gregory("5");
        gregory("0");
        gregory("werwer");
        System.out.println("------------");
        division(2, 0);
        System.out.println("------------");
        dragon(arr);
        dragon(arr2);
        System.out.println("------------");
        stringJoy(null);
        stringJoy("ldkmfm");
    }

    public static void division(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("На ноль не делится, чувачок");
        }
    }

    public static void dragon(String[] numbers) {
        try {
            int a = Integer.parseInt(numbers[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы");
        } catch (NumberFormatException e) {
            System.out.println("Невозможно преобразовать строку в число");
        }
    }

    public static void gregory(String value) {
        try {
            int num = Integer.parseInt(value);
            int result = 5 / num;
            System.out.println(result);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Ошибка: " + value);
        }
    }

    public static void stringJoy(String text) {
        try {
            System.out.println("Все топчик, строка не пустая" + text);
        } catch (NullPointerException e) {
            System.out.println("Поймали ошибку: строка пустая");
        } finally {
            System.out.println("Проверка строки завершилась успешно");
        }
    }
}
