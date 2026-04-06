package homework5.Task2;

public class Test {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(8);
        figures[1] = new Rectangle(5, 6);
        figures[2] = new Triangle(3, 4, 5);
        figures[3] = new Circle(3.5);
        figures[4] = new Rectangle(10, 2);

        double sumPerimeter = 0;
        for (Figure figure : figures) {
            figure.printInfo();
            sumPerimeter += figure.perimeter();
        }

        System.out.printf("Сумма периметров всех фигур = %.2f%n", sumPerimeter);
    }
}
