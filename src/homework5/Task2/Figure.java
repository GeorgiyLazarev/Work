package homework5.Task2;

/**
 * Задача 2:
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
 * периметра(используя абстрактный класс/методы). Создать массив из 5 разных
 * фигур. Вывести на экран сумму периметра всех фигур в массиве
 */

public abstract class Figure {
    public abstract double square();
    public abstract double perimeter();

    public void printInfo() {
        System.out.printf("Площадь = %.2f, Периметр = %.2f%n", square(), perimeter());
    }
}
