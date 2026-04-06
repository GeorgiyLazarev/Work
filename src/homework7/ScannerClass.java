package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClass {
    public static String[] scannerVoid() {
        Scanner scanner = new Scanner(System.in);
        String[] massive = new String[3];

        int number = 1;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d: ", number);
            String input = scanner.nextLine();
            massive[i] = input;
            number++;
        }
        scanner.close();
        System.out.println("----------");

        return massive;
    }
}
