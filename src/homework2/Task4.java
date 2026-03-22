package homework2;

/**
 * Задача 4:
 * Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */

public class Task4 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
