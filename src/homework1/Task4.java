package homework1;

/**
 Задача 4:
 В переменной n хранится вещественное число с ненулевой дробной частью.
 Создайте программу, которая округляет число n до ближайшего целого и
 выводящую результат на экран.
 */

public class Task4 {
    public static void main(String[] args){

        double n = 2.53451;
        int a = (int)Math.round(n);

        System.out.println("Округление числа " + n + " = " + a);
    }
}
