package homework1;

/**
 Задача 2:
 В переменной n хранится двузначное число. Создайте программу,
 вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
 результате мы должны получить 8 (2 + 6).
 */

public class Task2 {
    public static void main(String[] args) {

        int n = 12;
        int a = n/10;
        int b = n%10;
        int sum = a + b;

        System.out.println("Сумма цифр " + n + ": " + a + " + " + b + " = " + sum);
    }
}
