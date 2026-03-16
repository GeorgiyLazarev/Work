package homework1;

/**
 Задача 3:
 В переменной n хранится трёхзначное число. Создайте программу,
 вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
 результате мы должны получить 9 (1+2+6).
 */

public class Task3 {

    public static void main(String[] args){

        int n = 732;
        int a = n/100;
        int b = n%100/10;
        int c = n%100%10;
        int sum = a + b + c;

        System.out.println("Сумма цифр " + n + ": " + a + " + " + b + " + " + c + " = " + sum);
    }
}
