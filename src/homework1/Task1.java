package homework1;

/**
 * Задача 1:
 * Написать приложение, которое будет вычислять и выводить значение по
 * формуле: a=4*(b+c-1)/2;
 * b и c задаем в коде самостоятельно.
 */

public class Task1 {
    public static void main(String[] args) {

        double b = 6.2;
        double c = 54.4;
        double a = 4 * (b + c - 1) / 2;

        System.out.println("4 * (" + b + " + " + c + " - 1) / 2 = " + a);
    }
}
